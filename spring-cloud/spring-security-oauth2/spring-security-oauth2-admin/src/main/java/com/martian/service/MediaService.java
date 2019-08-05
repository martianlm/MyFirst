package com.martian.service;

import java.util.List;

import com.martian.model.TBMediaImg;

public interface MediaService {

	public boolean createMedia(TBMediaImg img) throws Exception;

	public List<TBMediaImg> selectMedia(String type);

	public TBMediaImg selectMediaById(String id);

	public void editMedia(TBMediaImg img) throws Exception;

	public void delMedia(String id);

}
