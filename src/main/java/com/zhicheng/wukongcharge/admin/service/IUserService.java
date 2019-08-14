package com.zhicheng.wukongcharge.admin.service;

import java.util.List;
import java.util.Map;

import com.zhicheng.wukongcharge.admin.entity.User;
/**
 * 用户service层
 * @author 章家宝
 *
 */
public interface IUserService {

	/**
	 * 通过唯一识别码获取user实体
	 * @param uniqueId
	 * @return
	 */
	List<User> getByUniqueId(String uniqueId);
	/**
	 * 分页查询实体
	 * @param map
	 * @return
	 */
	List<User> list(Map<String, Object> map);
	/**
	 * 获取到所有的数量
	 * @param map
	 * @return
	 */
	Long getTotal(Map<String, Object> map);
	/**
	 * 更新所有实体
	 * @param user
	 * @return
	 */
	int updateUserInfo(User user);
	/**
	 * 删除实体
	 * @param id
	 * @return
	 */
	int deleteUser(String id);
	/**
	 * 添加管理员
	 * @param user
	 * @return
	 */
	int addUser(User user);
}
