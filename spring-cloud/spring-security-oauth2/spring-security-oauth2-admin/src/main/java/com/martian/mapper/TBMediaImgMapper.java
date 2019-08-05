package com.martian.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.martian.model.TBMediaImg;

@Mapper
public interface TBMediaImgMapper {

	int createMedia(TBMediaImg img);

	List<TBMediaImg> selectMedia(@Param("type") String type);

	TBMediaImg selectMediaById(String id);

	void deleteMediaById(int id);

}
