package com.zhicheng.wukongcharge.admin.service;

import java.util.List;
import java.util.Map;

import com.zhicheng.wukongcharge.admin.entity.ChargingPile;
import com.zhicheng.wukongcharge.admin.entity.User;

/**
 * 充电桩的service层
 * @author 章家宝
 *
 */
public interface IChargingPileService {
	/**
	 * 通过唯一识别码获取充电桩实体
	 * @param uniqueId
	 * @return
	 */
	List<ChargingPile> getByUniqueId(String uniqueId);
	/**
	 * 分页查询实体
	 * @param map
	 * @return
	 */
	List<ChargingPile> list(Map<String, Object> map);
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
	int updateChargingPileInfo(ChargingPile chargingPile);
	/**
	 * 删除实体
	 * @param id
	 * @return
	 */
	int deleteChargingPile(String id);
	/**
	 * 添加充电桩
	 * @param user
	 * @return
	 */
	int addChargingPile(ChargingPile chargingPile);
}
