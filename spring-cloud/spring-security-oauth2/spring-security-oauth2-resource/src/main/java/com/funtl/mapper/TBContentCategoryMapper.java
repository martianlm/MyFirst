package com.funtl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.funtl.model.TBContentCategory;

@Mapper
public interface TBContentCategoryMapper {
	
	public List<TBContentCategory> getAll();

}
