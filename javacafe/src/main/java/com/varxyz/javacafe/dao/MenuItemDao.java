package com.varxyz.javacafe.dao;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.javacafe.domain.MenuItem;

public class MenuItemDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MenuItemDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	public void addMenuItem(MenuItem menuItem) {
		String sql = "INSERT INTO Category (menuName, menuSize, menuPrice, imgUrl)"
				+ " VALUES(?,?,?,?)";
		jdbcTemplate.update(sql, menuItem.getMenuName(), menuItem.getMenuSize(),
				menuItem.getMenuPrice(), menuItem.getImgUrl());
	}	
	
	public List<MenuItem> getMenuItem() {
		String sql= "SELECT cateType, cateName, regDate, menuName, menuSize, ,menuPrice, imgUrl, regDate FROM MenuItem";
		return jdbcTemplate.query(sql, new MenuItemRowMapper());
	}
	
	
}
