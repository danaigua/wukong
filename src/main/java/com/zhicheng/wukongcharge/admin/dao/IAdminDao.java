package com.zhicheng.wukongcharge.admin.dao;
/**
 * 管理员dao层
 * @author 章家宝
 *
 */

import java.util.List;
import java.util.Map;

import com.zhicheng.wukongcharge.admin.entity.Admin;

public interface IAdminDao {
	/**
	 * 通过用户名获取用户信息
	 * @param adminName
	 * @return
	 */
	Admin getByAdminName(String adminName);
	/**
	 * 分页列出所有的管理员
	 * @param map
	 * @return
	 */
	List<Admin> list(Map<String, Object> map);
	/**
	 * 得到记录总数
	 * @param map
	 * @return
	 */
	Long getTotal(Map<String, Object> map);
	/**
	 * 更新管理员信息
	 * @param admin
	 * @return
	 */
	int updateAdminInfo(Admin admin);
	/**
	 * 删除管理员
	 * @param id
	 * @return
	 */
	int deleteAdmin(String id);
	/**
	 * 添加管理员
	 * @param admin
	 * @return
	 */
	int addAdmin(Admin admin);
}
