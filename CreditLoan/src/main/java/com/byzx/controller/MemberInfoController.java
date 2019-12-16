/**
 * @filename MemberInfoController.java
 * @author lg
 * @date 2019年11月30日 下午12:05:59
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.byzx.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.byzx.model.MemberInfo;
import com.byzx.service.MemberInfoService;
import com.byzx.util.PageBean;
/**
 *@comment 客户业务控制类
 *@author lg
 *@date 2019年11月30日 下午12:08:45
 *@modifyUser lg
 *@modifyDate 2019年11月30日 下午12:08:45
 *@modifyDesc  TODO
 *@version TODO
 */
@Controller
public class MemberInfoController {
//注入service接口
	@Autowired
	MemberInfoService memberInfoService;
	
	@RequestMapping("/index")
	public String test(){
		return "tree";	
	}
	/**
     * @comment 分页查询客户基本信息
     * @param map  客户基本信息对象，page分页对象
     * @return 分页对象
     * @version 1.0
     */
	@RequestMapping("/findAllMember")
	//@ResponseBody
	public String findAllMemberInfo(MemberInfo memb,PageBean page,HttpServletRequest request){
		//总条数
		int totalCount=memberInfoService.getMemberInfoCount(memb);
		Map map=new HashMap();
		map.put("memb", memb);
		//计算当前索引下标位置
		page=new PageBean(page.getPageLimit(), page.getCurrNo());
		map.put("page", page);
		//查询客户信息列表
		List<MemberInfo> list=memberInfoService.findAllMemberInfo(map);
		PageBean pageBean=new PageBean(page.getPageLimit(), totalCount, page.getCurrNo(), list, "findAllMember", getParams(memb));
		request.setAttribute("page", pageBean);
		return "memb-list";
	}
	/**
	 * @comment  封装查询参数
	 * @param memb
	 * @return
	 * @version 1.0
	 */
	//&membName=&startAge=&endAge=.....
	public String getParams(MemberInfo memb){
		StringBuilder sb=new StringBuilder();
		//姓名 年龄段 身份证 创建时间
		if(memb.getMembName()!=null){
			sb.append("&membName=").append(memb.getMembName());
		}
		//年龄段查询
		if(memb.getStartAge()!=null){
			sb.append("&startAge=").append(memb.getStartAge());
		}
       if(memb.getEndAge()!=null){
    	   sb.append("&endAge=").append(memb.getEndAge());
		}
	
		if(memb.getCardNum()!=null){
			sb.append(" &cardNum=").append(memb.getCardNum());
		}
		
		//时间段查询
		 if(memb.getStartTime()!=null){
				sb.append("&startTime=").append(memb.getStartTime());
			}
		 if(memb.getEndTime()!=null){
				sb.append("&endTime=").append(memb.getEndTime());
			
		}
		return sb.toString();
	}
}
