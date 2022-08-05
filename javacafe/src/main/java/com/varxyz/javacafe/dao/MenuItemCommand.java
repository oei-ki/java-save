package com.varxyz.javacafe.dao;



import org.springframework.web.multipart.MultipartFile;

import com.varxyz.javacafe.domain.Category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuItemCommand {
	private long cateFk;
	private String menuName;
	private String menuSize;
	private double menuPrice;
	private MultipartFile file;
	private String imgUrl;
	
}
