package com.funtl.model;

import lombok.Data;

@Data
public class TBPermission {

	private Long id;
	
	private Long parentId;
	
	private String name;
	
	private String enname;
	
	private String url;
	
	private String description;
	
	private String created;
	
	private String updated;

}
