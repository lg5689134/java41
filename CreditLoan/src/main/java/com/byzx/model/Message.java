/**
 * @filename Message.java
 * @author ChongYangYang
 * @date 2019年11月29日 上午9:57:10
 * @version 1.0
 * Copyright (C) 2019 西安**发展有限责任公司
 */
package com.byzx.model;
public class Message {

	private Integer msg_id; //主键
	private String msg_title; //标题
	private String msg_context; //内容
	private String file_url; //附件
	private String send_type; //发送类型
	private String create_time; //创建时间
	private int create_by; //创建人
	
	public Integer getMsg_id() {
		return msg_id;
	}
	public void setMsg_id(Integer msg_id) {
		this.msg_id = msg_id;
	}
	public String getMsg_title() {
		return msg_title;
	}
	public void setMsg_title(String msg_title) {
		this.msg_title = msg_title;
	}
	public String getMsg_context() {
		return msg_context;
	}
	public void setMsg_context(String msg_context) {
		this.msg_context = msg_context;
	}
	public String getFile_url() {
		return file_url;
	}
	public void setFile_url(String file_url) {
		this.file_url = file_url;
	}
	public String getSend_type() {
		return send_type;
	}
	public void setSend_type(String send_type) {
		this.send_type = send_type;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public int getCreate_by() {
		return create_by;
	}
	public void setCreate_by(int create_by) {
		this.create_by = create_by;
	}
	
}

