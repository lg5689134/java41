package com.byzx.model;
/**@文件名: Recordist.java
 * @类功能说明: 还款记录表model层
 * @作者: LiuKaiWem
 * @Email: 1519960668@qq.com
 * @日期: 2019年11月29日上午10:35:24
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuKaiWem</li> 
 * 	 <li>日期: 2019年11月29日上午10:35:24</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Recordist {

	private Integer record_id;//还款记录id
	private Integer repayment_id;//还款id
	private Integer memb_id;//客户id
	private Integer contract_id;//合同id
	private Float repay_money;//还款金额
	private String batch_num;//还款批次
	private String source_card;//来源
	private String card_num;//还款银行卡号1
	private String create_time;//创建时间
	private String remark;//备注
	public Integer getRecord_id() {
		return record_id;
	}
	public void setRecord_id(Integer record_id) {
		this.record_id = record_id;
	}
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
	public Float getRepay_money() {
		return repay_money;
	}
	public void setRepay_money(Float repay_money) {
		this.repay_money = repay_money;
	}
	public String getBatch_num() {
		return batch_num;
	}
	public void setBatch_num(String batch_num) {
		this.batch_num = batch_num;
	}
	public String getSource_card() {
		return source_card;
	}
	public void setSource_card(String source_card) {
		this.source_card = source_card;
	}
	public String getCard_num() {
		return card_num;
	}
	public void setCard_num(String card_num) {
		this.card_num = card_num;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Recordist [record_id=" + record_id + ", repayment_id=" + repayment_id + ", memb_id=" + memb_id
				+ ", contract_id=" + contract_id + ", repay_money=" + repay_money + ", batch_num=" + batch_num
				+ ", source_card=" + source_card + ", card_num=" + card_num + ", create_time=" + create_time
				+ ", remark=" + remark + "]";
	}
	
	
	
}
