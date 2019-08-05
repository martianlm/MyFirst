package com.funtl.mpper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.funtl.model.TBPermission;

@Mapper
public interface TBPermissionMapper {
	
	public List<TBPermission> selectByUserId(@Param("userId") Long userId);

}
