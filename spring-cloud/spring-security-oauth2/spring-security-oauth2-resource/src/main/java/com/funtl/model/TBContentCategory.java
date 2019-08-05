package com.funtl.model;

import lombok.Data;

@Data
public class TBContentCategory {

	private Long id;
	
	private Long parentId;
	
	private String name;
	
	private int status;
	
	private int sortOrder;
	
	private int isParent;
	
	private String created;
	
	private String updated;
	
}
