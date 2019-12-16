/**
 * @filename MemberInfoService.java
 * @author lg
 * @date 2019年11月30日 上午11:59:33
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.byzx.service;

import java.util.List;
import java.util.Map;
import com.byzx.model.MemberInfo;

/**
 *@comment 客户信息业务接口
 *@author lg
 *@date 2019年11月30日 上午11:59:47
 *@modifyUser lg
 *@modifyDate 2019年11月30日 上午11:59:47
 *@modifyDesc  TODO
 *@version TODO
 */
public interface MemberInfoService {
	/**
	 * @comment  查询客户总数量
	 * @param memb 客户对象
	 * @return 总数量
	 * @version 1.0
	 */
	public int getMemberInfoCount(MemberInfo memb);
    /**
     * @comment 分页查询客户基本信息
     * @param map  客户基本信息对象，page分页对象
     * @return 客户基本信息列表
     * @version 1.0
     */
	public List<MemberInfo> findAllMemberInfo(Map map);
}
