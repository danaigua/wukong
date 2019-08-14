package com.zhicheng.wukongcharge.admin.service.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhicheng.wukongcharge.admin.dao.IChargingPileDao;
import com.zhicheng.wukongcharge.admin.entity.ChargingPile;
import com.zhicheng.wukongcharge.admin.entity.User;
import com.zhicheng.wukongcharge.admin.service.IChargingPileService;
/**
 * 充电桩的service层
 * @author 章家宝
 *
 */
@Service("chargingPileService")
public class ChargingPileServiceImpl implements IChargingPileService {

	@Resource
	private IChargingPileDao chargingPileDao;
	
	public List<ChargingPile> getByUniqueId(String uniqueId) {
		// TODO Auto-generated method stub
		return chargingPileDao.getByUniqueId(uniqueId);
	}

	public List<ChargingPile> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chargingPileDao.list(map);
	}

	public Long getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chargingPileDao.getTotal(map);
	}

	public int updateChargingPileInfo(ChargingPile chargingPile) {
		// TODO Auto-generated method stub
		return chargingPileDao.updateChargingPileInfo(chargingPile);
	}

	public int deleteChargingPile(String id) {
		// TODO Auto-generated method stub
		return chargingPileDao.deleteChargingPile(id);
	}

	public int addChargingPile(ChargingPile chargingPile) {
		// TODO Auto-generated method stub
		return chargingPileDao.addChargingPile(chargingPile);
	}

}
