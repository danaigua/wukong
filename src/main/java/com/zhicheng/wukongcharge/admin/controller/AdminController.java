package com.zhicheng.wukongcharge.admin.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhicheng.wukongcharge.admin.entity.Admin;
import com.zhicheng.wukongcharge.admin.service.IAdminService;
import com.zhicheng.wukongcharge.admin.utils.Md5Utils;
import com.zhicheng.wukongcharge.admin.utils.ResponseUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 管理员控制层
 * 
 * @author 章家宝
 *
 */
@Controller
@RequestMapping("/manager")
public class AdminController {

	@Resource
	private IAdminService adminService;

	/**
	 * 管理员登录，还没有进行登录验证
	 * 
	 * @param admin
	 * @param request
	 * @return
	 */
	@RequestMapping("/login")
	public String login(Admin admin, HttpServletRequest request) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(admin.getAdminName(),
				Md5Utils.md5(admin.getAdminPassword(), "zhichengwukong"));
		try {
			subject.login(token);// 登录验证
			return "redirect:/admin/main.jsp";
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("admin", admin);
			request.setAttribute("errorInfo", "用户名或者密码错误");
			return "login";
		}
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
		result.put("count", adminService.getTotal(null));
		int page1 = Integer.parseInt(page);
		int limit1 = Integer.parseInt(limit);
		page1 = (page1 - 1) * limit1;
		map.put("start", page1);
		map.put("size", limit1);
		List<Admin> adminList = adminService.list(map);
		JSONArray array = JSONArray.fromObject(adminList);
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
		int i = adminService.deleteAdmin(id);
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
	public String add(Admin admin, HttpServletResponse response) throws Exception {
		JSONObject result = new JSONObject();
		int i = adminService.addAdmin(admin);
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
	 * @param admin
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
		Admin admin = new Admin();
		admin.setId(Integer.parseInt(updateid));
		if("adminName".equals(updatefield)) {
			admin.setAdminName(updatevalue);
		}else if("adminPassword".equals(updatefield)) {
			admin.setAdminPassword(updatevalue);
		}else if("jurisdiction".equals(updatefield)) {
			admin.setJurisdiction(updatevalue);
		}else if("agencyNum".equals(updatefield)) {
			admin.setAgencyNum(updatevalue);
		}else if("telephone".equals(updatefield)) {
			admin.setTelephone(updatevalue);
		}else if("capital".equals(updatefield)) {
			admin.setCapital(Integer.parseInt(updatevalue));
		}else if("cashPledge".equals(updatefield)) {
			admin.setCashPledge(updatevalue);
		}else if("name".equals(updatefield)) {
			admin.setName(updatevalue);
		}else if("address".equals(updatefield)) {
			admin.setAddress(updatevalue);
		}else if("sex".equals(updatefield)) {
			admin.setSex(updatevalue);
		}else if("age".equals(updatefield)) {
			admin.setAge(Integer.parseInt(updatevalue));
		}
		int i = adminService.updateAdminInfo(admin);
		if (i > 0) {
			result.put("code", 1);
		} else {
			result.put("code", 0);
		}
		ResponseUtils.write(response, result);
		return null;
	}
}
