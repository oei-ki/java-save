package com.varxyz.javacafe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.varxyz.javacafe.dao.CategoryCommand;
import com.varxyz.javacafe.domain.Category;
import com.varxyz.javacafe.domain.MenuItem;
import com.varxyz.javacafe.service.CategoryServiceImpl;
import com.varxyz.javacafe.service.MenuItemServiceImpl;

@Controller
@RequestMapping("/cafe/add_menu")
public class MenuItemController {
	
	@Autowired
	MenuItemServiceImpl menuItemService;
	
	@Autowired
	CategoryServiceImpl categoryService;
	
	@GetMapping
	public String addMenuForm(Model model, HttpServletRequest request) {
		model.addAttribute("menuItem", new MenuItem());
		List<Category> menuCategoryList =
				categoryService.getCategory();
		request.setAttribute("menuCategoryList", menuCategoryList);	
		
		return "cafe/add_menu";
	}
	
//	@ModelAttribute("CategoryProviderList")//속성값 클래스에 넣고 리스트 다오에서 찾는 메서드 만들어서 컨트롤러에 넣어서 만들기...
//	public List<Category> getCategoryProviderList() {
//		List<Category> list = categoryService.getCategory();
//		return list;  //팀장님이 해주신건데 일단 주석처리하고 list로 함 땡겨와보자 get안에 다 비워도 됨 이걸로 할 때 
//	}

	
	/**
	 * 카테고리 추가한 db를 가져다가 옵션으로 나오게 만들고 싶음.
	 */
	@PostMapping
	public String addMenuItem(@ModelAttribute("menuItem") MenuItem menuItem, Model model) {
		
		model.addAttribute("menuItem", menuItem);
		menuItem.setMenuName(menuItem.getMenuName());
		menuItem.setMenuSize(menuItem.getMenuSize());
		menuItem.setMenuPrice(menuItem.getMenuPrice());
		menuItem.setImgUrl(menuItem.getImgUrl());
		
		
		menuItemService.addMenuItem(menuItem);
		
		return "cafe/success_add_menu";
	}
}
