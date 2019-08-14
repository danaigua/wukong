package com.zhicheng.wukongcharge.admin.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

public class Md5Utils {

	/**
	 * 私有化构造方法
	 */
	private Md5Utils() {
		
	}
	public Md5Utils builder() {
		Md5Utils md5Utils = new Md5Utils();
		return md5Utils;
	}
	/**
	 * 返回一个md5加密的结果(字符串)
	 * @return
	 */
	public static String md5(String str, String salt) {
		return new Md5Hash(str, salt).toString();
	}
	public static void main(String[] args) {
		System.out.println(Md5Utils.md5("admin", "zhichengwukong"));
	}
}
