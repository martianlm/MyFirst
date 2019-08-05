package com.funtl.mpper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.funtl.model.TBUser;

@Mapper
public interface UserMapper {

	public TBUser getByUsername( @Param("username") String username);
	
}
