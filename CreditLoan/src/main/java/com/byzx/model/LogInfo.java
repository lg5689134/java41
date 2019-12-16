package com.byzx.model;

/**@文件名:LogInfo.java
 * @类功能说明: 系统日志实体
 * @作者: WangSiYuan
 * @Email: 1512972568@qq.com
 * @日期: 2019年11月29日 上午9:59:41
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangSiYuan</li> 
 * 	 <li>日期: 2019年11月29日 上午9:59:41</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class LogInfo {
	private Integer log_id;		//日志主键id
	private String ip_address;		//ip地址
	private String url;		//请求url
	private String proj_name;		//项目名称
	private String log_type;	//类型:1 本系统 2  其他系统
	private String log_info;	//内容
	private String exception;	//异常信息
	private String create_time;		//创建时间
	private int create_by;		//创建人
	public Integer getLog_id() {
		return log_id;
	}
	public void setLog_id(Integer log_id) {
		this.log_id = log_id;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getProj_name() {
		return proj_name;
	}
	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}
	public String getLog_type() {
		return log_type;
	}
	public void setLog_type(String log_type) {
		this.log_type = log_type;
	}
	public String getLog_info() {
		return log_info;
	}
	public void setLog_info(String log_info) {
		this.log_info = log_info;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
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




