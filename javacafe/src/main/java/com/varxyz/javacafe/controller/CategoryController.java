package com.varxyz.javacafe.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.varxyz.javacafe.dao.CategoryCommand;
import com.varxyz.javacafe.domain.Category;
import com.varxyz.javacafe.service.CategoryServiceImpl;


@Controller
@RequestMapping("/cafe/add_category")
public class CategoryController {
	
	@Autowired
	CategoryServiceImpl categoryService;
	
	@GetMapping
	public String addCategoryForm(Model model) {
		model.addAttribute("category", new CategoryCommand());
		return "cafe/category";
	}
	
	@ModelAttribute("cateTypeProvider")
	public List<String> getCateTypeProviderList() {
		List<String> list = new ArrayList<String>();
		list.add("커피");
		list.add("음료");
		list.add("디저트");
		
		return list;
	}
	
	@PostMapping
	public String addCategory(@ModelAttribute("category") Category category, Model model) {
		
		model.addAttribute("category",category);
		category.setCateType(category.getCateType());
		category.setCateName(category.getCateName());
		
		categoryService.addCategory(category);
		
		return "cafe/success_category";
	}
}
