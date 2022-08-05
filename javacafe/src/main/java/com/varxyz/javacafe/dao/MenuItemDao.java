package com.varxyz.javacafe.dao;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.javacafe.domain.Category;
import com.varxyz.javacafe.domain.MenuItem;

public class MenuItemDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MenuItemDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	public void addMenuItem(MenuItem menuItem) {
		String sql = "INSERT INTO MenuItem (cateFk, menuName, menuSize, menuPrice, imgUrl)"
				+ " VALUES(?,?,?,?,?)";
		jdbcTemplate.update(sql,menuItem.getCateFk() ,menuItem.getMenuName(), menuItem.getMenuSize(),
				menuItem.getMenuPrice(), menuItem.getImgUrl());
	}	
	
	public List<MenuItem> getMenuItem() {
		String sql= "SELECT cateType, cateName, regDate, menuName, menuSize, ,menuPrice, imgUrl, regDate FROM MenuItem";
		return jdbcTemplate.query(sql, new MenuItemRowMapper());
	}
	
//	public Category getCategoryName(long cid) {
//		String sql="SELECT cid, cateType, cateName, regDate FROM Category WHERE cateName=?";
//		return jdbcTemplate.queryForObject(sql, new CategoryRowMapper(), cateName);
//	}	//형주미워ㅠㅠ강제로 앉혔어..
	
	public String getCategoryName(long cateFk) {
	      String sql = "SELECT cateName FROM Category WHERE cid = ?";
	      return jdbcTemplate.queryForObject(sql, String.class, cateFk);
	            
	}
	
	
}
