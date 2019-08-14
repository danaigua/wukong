package com.zhicheng.wukongcharge.admin.realm;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.zhicheng.wukongcharge.admin.entity.Admin;
import com.zhicheng.wukongcharge.admin.service.IAdminService;


public class MyRealm extends AuthorizingRealm{
	
	@Resource
	private IAdminService adminService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String adminName = (String) token.getPrincipal();
		Admin admin = adminService.getByAdminName(adminName);
		if(admin != null) {
			SecurityUtils.getSubject().getSession().setAttribute("currentAdmin", admin);
			AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(admin.getAdminName(), admin.getAdminPassword(), "xxx");
			return authcInfo;
		}else {
			return null;
		}
	}

}
