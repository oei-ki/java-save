package com.varxyz.javacafe.service;

import java.util.List;

import com.varxyz.javacafe.domain.MenuItem;

public interface MenuItemService {

	public void addMenuItem(MenuItem menuItem);
	List<MenuItem> getMenuItem();
}
