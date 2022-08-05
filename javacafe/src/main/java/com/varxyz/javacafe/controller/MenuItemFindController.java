package com.varxyz.javacafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.javacafe.dao.MenuItemCommand;
import com.varxyz.javacafe.service.CategoryServiceImpl;
import com.varxyz.javacafe.service.MenuItemServiceImpl;

@Controller
public class MenuItemFindController {
	
	@Autowired
	MenuItemServiceImpl menuItemService;
	
	@Autowired
	CategoryServiceImpl categoryService;
	
	@GetMapping
	public String findMenuItemForm(Model model) {
      model.addAttribute("menuItem", new MenuItemCommand());
      model.addAttribute("category", categoryService.getCategory());
      return "main/mainpage";
	}
	
	@PostMapping
	public String findMenuItem() {
		
	}

}
