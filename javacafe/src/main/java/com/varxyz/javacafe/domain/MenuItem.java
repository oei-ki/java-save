package com.varxyz.javacafe.domain;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuItem {
	private long mid;
	private String Menuname;
	private String MenuSize;
	private double MenuPrice;
	private String imgUrl;
	private Date regDate;
}
