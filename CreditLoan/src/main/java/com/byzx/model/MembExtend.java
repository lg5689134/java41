package com.byzx.model;

/**
 * @class_name:Memb_extend.java
 * @explain :客户扩展信息 
 * @author: HGY
 * @Email: 1053062097@qq.com
 * @date: 2019年11月29日 上午10:07:25
 */
public class MembExtend {

	private Integer extend_id;//扩展信息id
	private Integer memb_id;//客户id
	private String loan_use;//贷款用途
	private String firm_name;//单位名称
	private String profession;//职业
	private String firm_address;//单位地址
	private String firm_tel;//单位电话
	private String contact;//紧急联系人
	private String concat_phone;//紧急联系人电话
	private int salary;//月收入
	private String card_name;//所属银行
	private String card_num;//银行卡号
	private String create_time;//创建时间
	public Integer getExtend_id() {
		return extend_id;
	}
	public void setExtend_id(Integer extend_id) {
		this.extend_id = extend_id;
	}
	public Integer getMemb_id() {
		return memb_id;
	}
	public void setMemb_id(Integer memb_id) {
		this.memb_id = memb_id;
	}
	public String getLoan_use() {
		return loan_use;
	}
	public void setLoan_use(String loan_use) {
		this.loan_use = loan_use;
	}
	public String getFirm_name() {
		return firm_name;
	}
	public void setFirm_name(String firm_name) {
		this.firm_name = firm_name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getFirm_address() {
		return firm_address;
	}
	public void setFirm_address(String firm_address) {
		this.firm_address = firm_address;
	}
	public String getFirm_tel() {
		return firm_tel;
	}
	public void setFirm_tel(String firm_tel) {
		this.firm_tel = firm_tel;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getConcat_phone() {
		return concat_phone;
	}
	public void setConcat_phone(String concat_phone) {
		this.concat_phone = concat_phone;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCard_name() {
		return card_name;
	}
	public void setCard_name(String card_name) {
		this.card_name = card_name;
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
	

}
