package com.varxyz.javacafe.domain;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuCategory {
	/**
	 * 카테고리 대분류 중분류 만들어서 관리자가 추가할수 있게 만들어야 함.
	 */
	private long cid;
	private MenuItem menuList;
	private String cateType;
	private String cateName;
	private Date regDate;
}
