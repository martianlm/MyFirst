package com.funtl.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funtl.model.TBUser;
import com.funtl.mpper.UserMapper;
import com.funtl.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public TBUser getByUsername(String username) {
		// TODO Auto-generated method stub
		return userMapper.getByUsername(username);
	}

}
