package com.funtl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funtl.mapper.TBContentCategoryMapper;
import com.funtl.model.TBContentCategory;
import com.funtl.service.TBContentCategoryService;

@Service
public class TBContentCategoryServiceImpl implements TBContentCategoryService {
	
	@Autowired
	public TBContentCategoryMapper tBContentCategoryMapper;

	@Override
	public List<TBContentCategory> getAll() {
		// TODO Auto-generated method stub
		return tBContentCategoryMapper.getAll();
	}

}
