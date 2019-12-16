/**
 * @filename PageBean.java
 * @author lg
 * @date 2017年11月9日 上午9:39:25
 * @version 1.0
 * Copyright (C) 2017 
 */

package com.byzx.util;

import java.util.List;
import org.springframework.context.annotation.Scope;


/**
 * 分页实体bean
 * @author lg
 *
 */
public class PageBean {

	//每页显示条数
	private int pageLimit=10;
	//总条数
	private int totalNum=0;
	//当前页码
	private int currNo=1;
	//总页数
	private int totalPage=0;	
	//查询下标位置，limit 中的第一个参数
	private int pageIndex=0;
	
	
	//存储返回的集合对象
	private List<?> resultList;
	//请求地址, user/list.action
	

	private String url;
	//请求参数(搜索条件参数的封装), &userCode=admin&userType=1&userState=1
	private String params;
	
	
	
	public PageBean() {
		
	}
	/**
	 * @param page 每页显示条数
	 * @param currNo 当前页
	 */
	public PageBean(int pageLimit, int currNo) {
		this.pageLimit=pageLimit;
		this.currNo = currNo;
	}
	
	/**
	 * @param page 每页显示条数
	 * @param totalNum 总条数
	 * @param currNo 当前页
	 * @param resultList 结果集
	 * @param url 请求地址
	 * @param params 请求参数
	 */
	public PageBean(int pageLimit, int totalNum, int currNo, List<?> resultList, String url, String params) {
		super();
		this.pageLimit = pageLimit;
		this.totalNum = totalNum;
		this.currNo = currNo;
		this.resultList = resultList;
		this.url = url;
		this.params = params;
	}

	public int getPageLimit() {
		return pageLimit;
	}
	public void setPageLimit(int pageLimit) {
		this.pageLimit = pageLimit;
	}
	public int getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}
	//当前页码
	public int getCurrNo() {
		if(currNo==0){
			currNo=1;
		}
		return currNo;
	}
	public void setCurrNo(int currNo) {
		this.currNo = currNo;
	}
	//总页数
	public int getTotalPage() {
		totalPage=(totalNum%pageLimit==0)?(totalNum/pageLimit):(totalNum/pageLimit)+1;
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	//查询下标位置
	public int getPageIndex() {
		return pageLimit*(currNo-1);
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public List<?> getResultList() {
		return resultList;
	}

	public void setResultList(List<?> resultList) {
		this.resultList = resultList;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}
	
  

}
