package com.funtl.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funtl.model.TBPermission;
import com.funtl.mpper.TBPermissionMapper;
import com.funtl.service.TBPermissionService;

@Service
public class TBPermissionServiceImpl implements TBPermissionService {
	
	@Autowired
	private TBPermissionMapper tBPermissionMapper;

	@Override
	public List<TBPermission> selectByUserId(Long userId) {
		// TODO Auto-generated method stub
		return tBPermissionMapper.selectByUserId(userId);
	}

}
