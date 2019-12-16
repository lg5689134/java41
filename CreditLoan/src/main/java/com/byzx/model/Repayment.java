package com.byzx.model;
/**@文件名: Repayment.java
 * @类功能说明: 还款表model层
 * @作者: LiuKaiWem
 * @Email: 1519960668@qq.com
 * @日期: 2019年11月29日上午10:12:02
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuKaiWem</li> 
 * 	 <li>日期: 2019年11月29日上午10:12:02</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Repayment {

	private Integer repayment_id;//还款id
	private Integer memb_id;//客户id
	private Integer contract_id;//合同id
	private String batch_num;//还款批次
	private Float repay_money;//还款金额
	private String repay_type;//还款类型
	private Float surplus_momey;//剩余还款金额
	private Float fund_money;//公积金还款金额
	private Float fine_money;//滞纳金
	private String is_repayment;//是否还款
	private String create_time;//创建时间
	public Integer getRepayment_id() {
		return repayment_id;
	}
	public void setRepayment_id(Integer repayment_id) {
		this.repayment_id = repayment_id;
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
	public String getBatch_num() {
		return batch_num;
	}
	public void setBatch_num(String batch_num) {
		this.batch_num = batch_num;
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
	public Float getSurplus_momey() {
		return surplus_momey;
	}
	public void setSurplus_momey(Float surplus_momey) {
		this.surplus_momey = surplus_momey;
	}
	public Float getFund_money() {
		return fund_money;
	}
	public void setFund_money(Float fund_money) {
		this.fund_money = fund_money;
	}
	public Float getFine_money() {
		return fine_money;
	}
	public void setFine_money(Float fine_money) {
		this.fine_money = fine_money;
	}
	public String getIs_repayment() {
		return is_repayment;
	}
	public void setIs_repayment(String is_repayment) {
		this.is_repayment = is_repayment;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	@Override
	public String toString() {
		return "Repayment [repayment_id=" + repayment_id + ", memb_id=" + memb_id + ", contract_id=" + contract_id
				+ ", batch_num=" + batch_num + ", repay_money=" + repay_money + ", repay_type=" + repay_type
				+ ", surplus_momey=" + surplus_momey + ", fund_money=" + fund_money + ", fine_money=" + fine_money
				+ ", is_repayment=" + is_repayment + ", create_time=" + create_time + "]";
	}
	
	
	
	
	
}
