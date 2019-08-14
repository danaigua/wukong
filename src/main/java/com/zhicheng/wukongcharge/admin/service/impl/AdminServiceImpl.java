package com.zhicheng.wukongcharge.admin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.javafx.collections.MappingChange.Map;
import com.zhicheng.wukongcharge.admin.dao.IAdminDao;
import com.zhicheng.wukongcharge.admin.entity.Admin;
import com.zhicheng.wukongcharge.admin.service.IAdminService;


/**
 * 管理员服务实现类
 * @author 章家宝
 *
 */
@Service("adminService")
public class AdminServiceImpl implements IAdminService {

	@Resource
	private IAdminDao adminDao;

	public Admin getByAdminName(String adminName) {
		return adminDao.getByAdminName(adminName);
	}

	public List<Admin> list(java.util.Map<String, Object> map) {
		return adminDao.list(map);
	}

	public Long getTotal(java.util.Map<String, Object> map) {
		return adminDao.getTotal(map);
	}

	public int updateAdminInfo(Admin admin) {
		return adminDao.updateAdminInfo(admin);
	}

	public int deleteAdmin(String id) {
		return adminDao.deleteAdmin(id);
	}

	public int addAdmin(Admin admin) {
		return adminDao.addAdmin(admin);
	}
}
