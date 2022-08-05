package com.varxyz.javacafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.varxyz.javacafe.dao.MenuItemDao;
import com.varxyz.javacafe.domain.Category;
import com.varxyz.javacafe.domain.MenuItem;

public class MenuItemServiceImpl implements MenuItemService {
	
	@Autowired
	MenuItemDao menuItemDao;

	@Override
	public void addMenuItem(MenuItem menuItem) {
		menuItemDao.addMenuItem(menuItem);
	}

	@Override
	public List<MenuItem> getMenuItem() {
		return menuItemDao.getMenuItem();
	}

	@Override
	public String getCategoryName(long cateFk) {
		return menuItemDao.getCategoryName(cateFk);
	}




}
