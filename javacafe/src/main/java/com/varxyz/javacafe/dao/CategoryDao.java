package com.varxyz.javacafe.dao;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.javacafe.domain.MenuCategory;

public class CategoryDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CategoryDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addCategory(MenuCategory menuCategory) {
		String sql = "INSERT INTO Category (menuList, cateName, cateType) VALUSE (?,?,?)"; 
		jdbcTemplate.update(sql, menuCategory.getMenuList(), menuCategory.getCateName(), menuCategory.getCateType());
	}
	
	public void addSubCategory() {
		
	}
	
	
	
}
