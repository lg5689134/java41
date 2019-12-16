/**
 * @filename UserMessage.java
 * @author ChongYangYang
 * @date 2019年11月29日 上午10:12:38
 * @version 1.0
 * Copyright (C) 2019 西安**发展有限责任公司
 */
package com.byzx.model;
public class UserMessage {

	private Integer user_msg_id; //主键
	private int msg_id; //站内信id
	private String read_state; //状态
	private int from_user; //from_user
	private int to_user; //to_user
	private int parent_id; //父id
	private String is_delete; //删除标记
	
	public Integer getUser_msg_id() {
		return user_msg_id;
	}
	public void setUser_msg_id(Integer user_msg_id) {
		this.user_msg_id = user_msg_id;
	}
	public int getMsg_id() {
		return msg_id;
	}
	public void setMsg_id(int msg_id) {
		this.msg_id = msg_id;
	}
	public String getRead_state() {
		return read_state;
	}
	public void setRead_state(String read_state) {
		this.read_state = read_state;
	}
	public int getFrom_user() {
		return from_user;
	}
	public void setFrom_user(int from_user) {
		this.from_user = from_user;
	}
	public int getTo_user() {
		return to_user;
	}
	public void setTo_user(int to_user) {
		this.to_user = to_user;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public String getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(String is_delete) {
		this.is_delete = is_delete;
	}
	
}

