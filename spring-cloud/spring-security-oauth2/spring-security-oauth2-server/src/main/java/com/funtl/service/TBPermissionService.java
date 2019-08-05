package com.funtl.service;

import java.util.List;

import com.funtl.model.TBPermission;

public interface TBPermissionService {

	public List<TBPermission> selectByUserId(Long userId);
}
