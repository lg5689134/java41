package com.byzx.model;

/**@文件名:com.byzx.model
 * @类功能说明: 回收站实体
 * @作者: WangSiYuan
 * @Email: 1512972568@qq.com
 * @日期: 2019年11月29日 上午9:44:21
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangSiYuan</li> 
 * 	 <li>日期: 2019年11月29日 上午9:44:21</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Recycle {
	private Integer recy_id;	//回收站ID
	private String db_user;		//数据库用户
	private int class_id;	//系统分类 模块id
	private String intro;	//描述
	private String table_name;	//表名称
	private String key_name;	//主键名称
	private String create_time;//创建时间
	private int key_value;	//主键值
	private int create_by;	//创建人
	public Integer getRecy_id() {
		return recy_id;
	}
	public void setRecy_id(Integer recy_id) {
		this.recy_id = recy_id;
	}
	public String getDb_user() {
		return db_user;
	}
	public void setDb_user(String db_user) {
		this.db_user = db_user;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getKey_name() {
		return key_name;
	}
	public void setKey_name(String key_name) {
		this.key_name = key_name;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public int getKey_value() {
		return key_value;
	}
	public void setKey_value(int key_value) {
		this.key_value = key_value;
	}
	public int getCreate_by() {
		return create_by;
	}
	public void setCreate_by(int create_by) {
		this.create_by = create_by;
	}
	
	
}



