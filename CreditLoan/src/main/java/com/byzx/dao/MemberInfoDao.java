/**
 * @filename MemberInfomDao.java
 * @author lg
 * @date 2019年11月30日 上午10:23:45
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.byzx.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.byzx.model.MemberInfo;

/**
 *@comment 客户基本信息映射接口
 *@author lg
 *@date 2019年11月30日 上午10:23:54
 *@modifyUser lg
 *@modifyDate 2019年11月30日 上午10:23:54
 *@modifyDesc  TODO
 *@version TODO
 */
public interface MemberInfoDao {
	/**
	 * @comment  查询客户总数量
	 * @param memb 客户对象
	 * @return 总数量
	 * @version 1.0
	 */
	@SelectProvider(type=MemberInfoProvider.class,method="getMemberInfoCount")
	public int getMemberInfoCount(MemberInfo memb);
    /**
     * @comment 分页查询客户基本信息
     * @param map  客户基本信息对象，page分页对象
     * @return 客户基本信息列表
     * @version 1.0
     */
	@SelectProvider(type=MemberInfoProvider.class,method="findAllMemberInfo")
	@Results(id="memberResultMap",value={
			@Result(id=true,column="memb_id",property="membId"),
			@Result(column="memb_name",property="membName"),
			@Result(column="card_num",property="cardNum"),
			@Result(column="create_time",property="createTime")
	})
	public List<MemberInfo> findAllMemberInfo(Map map);
	
	/*
	 * 内部类，用于封装动态sql使用
	 */
	class MemberInfoProvider{
		/**
		 * @comment 分页查询客户总条数
		 * @return sql
		 * @version 1.0
		 */
		public String getMemberInfoCount(MemberInfo memb){
			StringBuilder sb=new StringBuilder();
			sb.append("select count(0) from member_info where 1=1 ");
			//姓名 年龄段 身份证 创建时间
			if(memb.getMembName()!=null){
				sb.append(" and memb_name like concat('%',#{membName},'%')");
			}
			//年龄段查询
			if(memb.getStartAge()!=null || memb.getEndAge()!=null){
				if(memb.getStartAge()!=null && memb.getEndAge()!=null){
					sb.append(" and (age>=#{startAge} and age <=#{endAge}) ");
				}else if(memb.getStartAge()!=null){
					sb.append(" and age>=#{startAge} ");
				}else if(memb.getEndAge()!=null){
					sb.append(" and age <=#{endAge}");
				}
			}
		
			if(memb.getCardNum()!=null){
				sb.append(" and card_num=#{cardNum}");
			}
			
			//时间段查询
			if(memb.getStartTime()!=null || memb.getEndTime()!=null){
				if(memb.getStartTime()!=null && memb.getEndTime()!=null){
					sb.append(" and (create_time>#{startTime} and (create_time <#{endTime} OR create_time LIKE CONCAT(#{endTime},'%'))) ");
				}else if(memb.getStartTime()!=null){
					sb.append(" and create_time>#{startTime} ");
				}else if(memb.getEndTime()!=null){
					sb.append(" and (create_time <#{endTime} OR create_time LIKE CONCAT(#{endTime},'%'))");
				}
			}
			return sb.toString();
		}
		/**
		 * @comment 分页查询客户基本信息
		 * @return sql
		 * @version 1.0
		 */
		public String findAllMemberInfo(Map map){
			StringBuilder sb=new StringBuilder();
			sb.append("select * from member_info where 1=1 ");
			//姓名 年龄段 身份证 创建时间
			MemberInfo memb =(MemberInfo)map.get("memb");
			if(memb.getMembName()!=null){
				sb.append(" and memb_name like concat('%',#{memb.membName},'%')");
			}
			//年龄段查询
			if(memb.getStartAge()!=null || memb.getEndAge()!=null){
				if(memb.getStartAge()!=null && memb.getEndAge()!=null){
					sb.append(" and (age>=#{memb.startAge} and age <=#{memb.endAge}) ");
				}else if(memb.getStartAge()!=null){
					sb.append(" and age>=#{memb.startAge} ");
				}else if(memb.getEndAge()!=null){
					sb.append(" and age <=#{memb.endAge}");
				}
			}
		
			if(memb.getCardNum()!=null){
				sb.append(" and card_num=#{memb.cardNum}");
			}
			
			//时间段查询
			if(memb.getStartTime()!=null || memb.getEndTime()!=null){
				if(memb.getStartTime()!=null && memb.getEndTime()!=null){
					sb.append(" and (create_time>#{memb.startTime} and (create_time <#{memb.endTime} OR create_time LIKE CONCAT(#{memb.endTime},'%'))) ");
				}else if(memb.getStartTime()!=null){
					sb.append(" and create_time>#{memb.startTime} ");
				}else if(memb.getEndTime()!=null){
					sb.append(" and (create_time <#{memb.endTime} OR create_time LIKE CONCAT(#{memb.endTime},'%'))");
				}
			}
			sb.append(" limit #{page.pageIndex},#{page.pageLimit}");
			return sb.toString();
		}
		
	}
}
