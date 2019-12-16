package com.byzx.model;
/**
 * @class_name:Files.java
 * @explain : 客户附件信息
 * @author: HGY
 * @Email: 1053062097@qq.com
 * @date: 2019年11月29日 上午10:19:08
 */
public class Files {

	private Integer file_id;//资料id
	private Integer parent_id;//文件父id
	private Integer memb_id;//客户id
	private String file_name;//文件名称
	private String file_desc;//文件描述
	private String file_url;//文件url
	private String create_time;//创建时间
	private Integer create_by;//创建人
	private String update_time;//修改时间
	private Integer update_by;//修改人
	private String is_delete;//删除标记
	public Integer getFile_id() {
		return file_id;
	}
	public void setFile_id(Integer file_id) {
		this.file_id = file_id;
	}
	public Integer getParent_id() {
		return parent_id;
	}
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
	public Integer getMemb_id() {
		return memb_id;
	}
	public void setMemb_id(Integer memb_id) {
		this.memb_id = memb_id;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFile_desc() {
		return file_desc;
	}
	public void setFile_desc(String file_desc) {
		this.file_desc = file_desc;
	}
	public String getFile_url() {
		return file_url;
	}
	public void setFile_url(String file_url) {
		this.file_url = file_url;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public Integer getCreate_by() {
		return create_by;
	}
	public void setCreate_by(Integer create_by) {
		this.create_by = create_by;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public Integer getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(Integer update_by) {
		this.update_by = update_by;
	}
	public String getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(String is_delete) {
		this.is_delete = is_delete;
	}
	
}
