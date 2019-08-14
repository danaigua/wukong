package com.zhicheng.wukongcharge.admin.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhicheng.wukongcharge.admin.dao.IUserDao;
import com.zhicheng.wukongcharge.admin.entity.User;
import com.zhicheng.wukongcharge.admin.service.IUserService;
/**
 * 用户服务层实体
 * @author 章家宝
 *
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;
	
	public List<User> getByUniqueId(String uniqueId) {
		return userDao.getByUniqueId(uniqueId);
	}

	public List<User> list(Map<String, Object> map) {
		return userDao.list(map);
	}

	public Long getTotal(Map<String, Object> map) {
		return userDao.getTotal(map);
	}

	public int updateUserInfo(User user) {
		return userDao.updateUserInfo(user);
	}

	public int deleteUser(String id) {
		return userDao.deleteUser(id);
	}

	public int addUser(User user) {
		return userDao.addUser(user);
	}

}
