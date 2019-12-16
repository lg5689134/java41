/**
 * @filename MemberInfo.java
 * @author lg
 * @date 2019年11月30日 上午10:22:09
 * @version 1.0
 * Copyright (C) 2019 
 */
package com.byzx.model;

import java.io.Serializable;

/**
 *@comment 客户基本信息实体类
 *@author lg
 *@date 2019年11月30日 上午10:08:13
 *@modifyUser lg
 *@modifyDate 2019年11月30日 上午10:08:13
 *@modifyDesc  TODO
 *@version TODO
 */
public class MemberInfo implements Serializable{
	private static final long serialVersionUID = -4494463979441225988L;
	/**
	 * 客户id
	 */
	private Integer membId;
	/**
	 * 客户姓名
	 */
	private String membName;
	/**
	 * 客户性别
	 */
	private String sex;
	/**
	 * 客户年龄
	 */
	private Integer age;
	/**
	 * 客户年龄开始段
	 */
	private Integer startAge;
	/**
	 * 客户年龄结束段
	 */
	private Integer endAge;
	/**
	 * 客户身份证号
	 */
	private String cardNum;
	/*
	 * 客户照片
	 */
	private String pic;
	/*
	 * 客户婚姻状况
	 */
	private String isMarriy;
    /*
     * 民族
     */
	private String nation;
    /*
     * 电话
     */
	private String phone;
	/*
	 * 户籍所在地
	 */
	private String oldAddress;
	/*
	 * 现住址
	 */
	private String newAddress;
	/*
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 开始时间
	 */
	private String startTime;
	/**
	 * 结束时间
	 */
	private String endTime;
	
	public Integer getMembId() {
		return membId;
	}
	public void setMembId(Integer membId) {
		this.membId = membId;
	}
	public String getMembName() {
		return membName;
	}
	public void setMembName(String membName) {
		this.membName = membName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getIsMarriy() {
		return isMarriy;
	}
	public void setIsMarriy(String isMarriy) {
		this.isMarriy = isMarriy;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOldAddress() {
		return oldAddress;
	}
	public void setOldAddress(String oldAddress) {
		this.oldAddress = oldAddress;
	}
	public String getNewAddress() {
		return newAddress;
	}
	public void setNewAddress(String newAddress) {
		this.newAddress = newAddress;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	public Integer getStartAge() {
		return startAge;
	}
	public void setStartAge(Integer startAge) {
		this.startAge = startAge;
	}
	public Integer getEndAge() {
		return endAge;
	}
	public void setEndAge(Integer endAge) {
		this.endAge = endAge;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "MemberInfo [membId=" + membId + ", membName=" + membName
				+ ", sex=" + sex + ", age=" + age + ", cardNum=" + cardNum
				+ ", pic=" + pic + ", isMarriy=" + isMarriy + ", nation="
				+ nation + ", phone=" + phone + ", oldAddress=" + oldAddress
				+ ", newAddress=" + newAddress + ", createTime=" + createTime
				+ "]";
	}

}
