package com.zhicheng.wukongcharge.admin.entity;
/**
 * 管理员实体类
 * @author 章家宝
 *
 */
public class Admin {
	
	private int id;
	private String adminName;//管理员账号
	private String adminPassword;//管理员密码
	private String jurisdiction;//管理员权限
	private String agencyNum;//管理员代理号
	private String telephone;//管理员手机号码
	private int capital;//管理员得到的资金（收益）
	private String cashPledge;//管理员押金
	private String name;//管理员姓名
	private String address;//管理员住址
	private String sex;//管理员性别
	private int age;//管理员年龄
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getJurisdiction() {
		return jurisdiction;
	}
	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
	public String getAgencyNum() {
		return agencyNum;
	}
	public void setAgencyNum(String agencyNum) {
		this.agencyNum = agencyNum;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public int getCapital() {
		return capital;
	}
	public void setCapital(int capital) {
		this.capital = capital;
	}
	public String getCashPledge() {
		return cashPledge;
	}
	public void setCashPledge(String cashPledge) {
		this.cashPledge = cashPledge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
