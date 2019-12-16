package com.byzx.model;
/**@文件名: Repaymentapp.java
 * @类功能说明: 提前还款申请表model层
 * @作者: LiuKaiWem
 * @Email: 1519960668@qq.com
 * @日期: 2019年11月29日上午10:24:50
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuKaiWem</li> 
 * 	 <li>日期: 2019年11月29日上午10:24:50</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Repaymentapp {

	private Integer repay_app_id;//还款申请id
	private Integer memb_id;//客户id
	private Integer contract_id;//合同id
	private Float repay_money;//申请还款金额
	private String repay_type;//还款类型
	private Float real_money;//实际还款金额
	private Integer audit_state;//审核状态
	private String create_time;//创建时间
	public Integer getRepay_app_id() {
		return repay_app_id;
	}
	public void setRepay_app_id(Integer repay_app_id) {
		this.repay_app_id = repay_app_id;
	}
	public Integer getMemb_id() {
		return memb_id;
	}
	public void setMemb_id(Integer memb_id) {
		this.memb_id = memb_id;
	}
	public Integer getContract_id() {
		return contract_id;
	}
	public void setContract_id(Integer contract_id) {
		this.contract_id = contract_id;
	}
	public Float getRepay_money() {
		return repay_money;
	}
	public void setRepay_money(Float repay_money) {
		this.repay_money = repay_money;
	}
	public String getRepay_type() {
		return repay_type;
	}
	public void setRepay_type(String repay_type) {
		this.repay_type = repay_type;
	}
	public Float getReal_money() {
		return real_money;
	}
	public void setReal_money(Float real_money) {
		this.real_money = real_money;
	}
	public Integer getAudit_state() {
		return audit_state;
	}
	public void setAudit_state(Integer audit_state) {
		this.audit_state = audit_state;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	@Override
	public String toString() {
		return "Repaymentapp [repay_app_id=" + repay_app_id + ", memb_id=" + memb_id + ", contract_id=" + contract_id
				+ ", repay_money=" + repay_money + ", repay_type=" + repay_type + ", real_money=" + real_money
				+ ", audit_state=" + audit_state + ", create_time=" + create_time + "]";
	}
	
}
