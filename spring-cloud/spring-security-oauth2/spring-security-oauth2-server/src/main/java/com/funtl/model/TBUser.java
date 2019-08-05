package com.funtl.model;

import lombok.Data;

@Data
public class TBUser {

	private Long id;
	
	private String username;
	
	private String password;
	
	private String phone;
	
	private String email;
	
	private String created;
	
	private String updated;

}
