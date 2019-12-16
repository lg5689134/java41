/**
 * @filename MemberInfoServiceImpl.java
 * @author lg
 * @date 2019年11月30日 下午12:01:20
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.byzx.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.MemberInfoDao;
import com.byzx.model.MemberInfo;
import com.byzx.service.MemberInfoService;

/**
 *@comment 会员业务实现类
 *@author lg
 *@date 2019年11月30日 下午12:01:34
 *@modifyUser lg
 *@modifyDate 2019年11月30日 下午12:01:34
 *@modifyDesc  TODO
 *@version TODO
 */
@Service
public class MemberInfoServiceImpl implements MemberInfoService{
//注入dao层接口
	@Autowired
	private MemberInfoDao memberInfoDao;
	/**
	 * @comment  查询客户总数量
	 * @param memb 客户对象
	 * @return 总数量
	 * @version 1.0
	 */
	@Override
	public int getMemberInfoCount(MemberInfo memb) {
		return memberInfoDao.getMemberInfoCount(memb);
	}
	/**
     * @comment 分页查询客户基本信息
     * @param map  客户基本信息对象，page分页对象
     * @return 客户基本信息列表
     * @version 1.0
     */
	@Override
	public List<MemberInfo> findAllMemberInfo(Map map) {
		return memberInfoDao.findAllMemberInfo(map);
	}

}
