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

import com.zhicheng.wukongcharge.admin.entity.User;
import com.zhicheng.wukongcharge.admin.service.IUserService;
import com.zhicheng.wukongcharge.admin.utils.ResponseUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 用户controller层
 * 
 * @author 章家宝
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;

	/**
	 * 管理员登录，还没有进行登录验证
	 * 
	 * @param admin
	 * @param request
	 * @return
	 */
	@RequestMapping("/login")
	public String login(User user, HttpServletRequest request) {
		return null;
	}

	/**
	 * 分页查询管理员
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
		result.put("count", userService.getTotal(null));
		int page1 = Integer.parseInt(page);
		int limit1 = Integer.parseInt(limit);
		page1 = (page1 - 1) * limit1;
		map.put("start", page1);
		map.put("size", limit1);
		List<User> userList = userService.list(map);
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
		int i = userService.deleteUser(id);
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
	public String add(User user, HttpServletResponse response) throws Exception {
		JSONObject result = new JSONObject();
		int i = userService.addUser(user);
		if (i > 0) {
			result.put("code", 1);
		} else {
			result.put("code", 0);
		}
		ResponseUtils.write(response, result);
		return null;
	}

	/**
	 * 更新管理员
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
		User user = new User();
		user.setId(Integer.parseInt(updateid));
		if("nickName".equals(updatefield)) {
			user.setNickName(updatevalue);
		}else if("gender".equals(updatefield)) {
			user.setGender(updatevalue);
		}else if("country".equals(updatefield)) {
			user.setCountry(updatevalue);
		}else if("province".equals(updatefield)) {
			user.setProvince(updatevalue);
		}else if("city".equals(updatefield)) {
			user.setCity(updatevalue);
		}else if("language".equals(updatefield)) {
			user.setLanguage(updatevalue);
		}else if("telephone".equals(updatefield)) {
			user.setTelephone(updatevalue);
		}
		int i = userService.updateUserInfo(user);
		if (i > 0) {
			result.put("code", 1);
		} else {
			result.put("code", 0);
		}
		ResponseUtils.write(response, result);
		return null;
	}
}
