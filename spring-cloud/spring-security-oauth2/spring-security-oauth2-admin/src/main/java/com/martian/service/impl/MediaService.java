package com.martian.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.martian.mapper.TBMediaImgMapper;
import com.martian.model.TBMediaImg;

@Service
public class MediaService implements com.martian.service.MediaService {

	@Autowired
	public TBMediaImgMapper tBMediaImgMapper;

	@Transactional
	@Override
	public boolean createMedia(TBMediaImg img) throws Exception {
		// TODO Auto-generated method stub
		Random random = new Random();
		int id = random.nextInt(10000);
		img.setId(id);
		img.setUserId(37);
		int row = tBMediaImgMapper.createMedia(img);
		if (row <= 0) {
			throw new Exception("创建失败");
		}
		return true;
	}

	public String getExtName(String url) {
		if (null == url || "".equals(url)) {
			return "";
		}
		String[] split = url.split(".");
		String extName = split[split.length - 1];
		return extName;
	}

	@Override
	public List<TBMediaImg> selectMedia(String type) {
		// TODO Auto-generated method stub
		return tBMediaImgMapper.selectMedia(type);
	}

	@Override
	public TBMediaImg selectMediaById(String id) {
		// TODO Auto-generated method stub
		return tBMediaImgMapper.selectMediaById(id);
	}

	@Transactional
	@Override
	public void editMedia(TBMediaImg img) throws Exception {
		// TODO Auto-generated method stub
		img.setEditTime(new Date().toString());
		tBMediaImgMapper.deleteMediaById(img.getId());
		int row = tBMediaImgMapper.createMedia(img);
		if (row <= 0) {
			throw new Exception("创建失败");
		}

	}

	@Override
	public void delMedia(String id) {
		tBMediaImgMapper.deleteMediaById(Integer.parseInt(id));

	}

}
