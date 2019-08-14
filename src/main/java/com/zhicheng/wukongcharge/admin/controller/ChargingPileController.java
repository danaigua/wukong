package com.zhicheng.wukongcharge.admin.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhicheng.wukongcharge.admin.entity.ChargingPile;
import com.zhicheng.wukongcharge.admin.service.IChargingPileService;
import com.zhicheng.wukongcharge.admin.utils.ResponseUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/chargingPile")
public class ChargingPileController {

	@Resource
	private IChargingPileService chargingPileService;
	
	/**
	 * 管理员登录，还没有进行登录验证
	 * 
	 * @param admin
	 * @param request
	 * @return
	 */
	@RequestMapping("/login")
	public String login(ChargingPile chargingPile, HttpServletRequest request) {
		return null;
	}

	/**
	 * 分页查询充电桩
	 * 
	 * @param limit
	 * @param page
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/admin/list")
	public String list(@RequestParam(value = "limit", required = false) String limit,
			@RequestParam(value = "page", required = false) String page, HttpServletResponse response)
			throws Exception {
		JSONObject result = new JSONObject();
		Map<String, Object> map = new HashMap<String, Object>();
		result.put("msg", "");
		result.put("code", 0);
		result.put("count", chargingPileService.getTotal(null));
		int page1 = Integer.parseInt(page);
		int limit1 = Integer.parseInt(limit);
		page1 = (page1 - 1) * limit1;
		map.put("start", page1);
		map.put("size", limit1);
		List<ChargingPile> userList = chargingPileService.list(map);
		JSONArray array = JSONArray.fromObject(userList);
		result.put("data", array);
		ResponseUtils.write(response, result);
		return null;
	}

	/**
	 * 删除管理员
	 * 
	 * @param id
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/admin/delete")
	public String delete(@RequestParam(value = "id", required = false) String id, HttpServletResponse response)
			throws IOException {
		JSONObject result = new JSONObject();
		int i = chargingPileService.deleteChargingPile(id);
		if (i > 0) {
			result.put("code", 1);
		} else {
			result.put("code", 0);
		}
		ResponseUtils.write(response, result);
		return null;
	}

	/**
	 * 添加管理员
	 * 
	 * @param admin
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/admin/add")
	public String add(ChargingPile chargingPile, HttpServletResponse response) throws Exception {
		JSONObject result = new JSONObject();
		int i = chargingPileService.addChargingPile(chargingPile);
		if (i > 0) {
			result.put("code", 1);
		} else {
			result.put("code", 0);
		}
		ResponseUtils.write(response, result);
		return null;
	}

	/**
	 * 更新充电桩
	 * 
	 * @param user
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/admin/update")
	public String update(@RequestParam(value = "updateid", required = false) String updateid,
			@RequestParam(value = "updatefield", required = false) String updatefield,
			@RequestParam(value = "updatevalue", required = false) String updatevalue, HttpServletResponse response)
			throws Exception {
		JSONObject result = new JSONObject();
		ChargingPile chargingPile = new ChargingPile();
		chargingPile.setId(Integer.parseInt(updateid));
		if("uniqueId".equals(updatefield)) {
			chargingPile.setUniqueId(updatevalue);
		}else if("address".equals(updatefield)) {
			chargingPile.setAddress(updatevalue);
		}else if("state".equals(updatefield)) {
			chargingPile.setState(updatevalue);
		}else if("outlet1".equals(updatefield)) {
			chargingPile.setOutlet1(updatevalue);
		}else if("outlet2".equals(updatefield)) {
			chargingPile.setOutlet2(updatevalue);
		}else if("outlet3".equals(updatefield)) {
			chargingPile.setOutlet3(updatevalue);
		}else if("outlet4".equals(updatefield)) {
			chargingPile.setOutlet4(updatevalue);
		}else if("outlet5".equals(updatefield)) {
			chargingPile.setOutlet5(updatevalue);
		}else if("outlet6".equals(updatefield)) {
			chargingPile.setOutlet6(updatevalue);
		}else if("outlet7".equals(updatefield)) {
			chargingPile.setOutlet7(updatevalue);
		}else if("outlet8".equals(updatefield)) {
			chargingPile.setOutlet8(updatevalue);
		}else if("outlet9".equals(updatefield)) {
			chargingPile.setOutlet9(updatevalue);
		}else if("outlet10".equals(updatefield)) {
			chargingPile.setOutlet10(updatevalue);
		}
		int i = chargingPileService.updateChargingPileInfo(chargingPile);
		if (i > 0) {
			result.put("code", 1);
		} else {
			result.put("code", 0);
		}
		ResponseUtils.write(response, result);
		return null;
	}
}
