package com.funtl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funtl.model.TBContentCategory;
import com.funtl.service.TBContentCategoryService;

@RestController
public class ContentController {
	
	@Autowired
	public TBContentCategoryService tBContentCategoryService;
	
	@RequestMapping("/")
	public List<TBContentCategory> getAll(){
		return tBContentCategoryService.getAll();
	}

}
