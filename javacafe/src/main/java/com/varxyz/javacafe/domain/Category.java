package com.varxyz.javacafe.domain;

import java.sql.Timestamp;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Category {
	/**
	 * 카테고리 대분류 중분류 만들어서 관리자가 추가할수 있게 만들어야 함.
	 */
	private long cid;
	private String cateType;
	private String cateName;
	private Date regDate;
	
	public Category() {
		super();
	}
	
	public Category(long cid) {
		this.cid = cid;
	}  //이거 뭔 역할인지 모르겠음

}
