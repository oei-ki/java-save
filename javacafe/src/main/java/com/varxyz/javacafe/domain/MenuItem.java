package com.varxyz.javacafe.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class MenuItem {
	private long mid;
	private Category category;
	private Category cateFk;   //fk
	private String cafeName; //결국 나중에 command로 바꿔야하고 jsp에 있는ㄴ path는 무조건 여기 있어야한다고 함!
	private String menuName;
	private String menuSize;
	private double menuPrice;
	private String imgUrl;
	private Date regDate;
	
	public MenuItem() {
		super();
	}
	
	public MenuItem(long mid) {
		this.mid = mid;
	}
}
