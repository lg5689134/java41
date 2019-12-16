package com.byzx.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.byzx.model.User;

public interface UserDao {

	@Select("select user_id,user_pwd,user_name from t_userInfo where user_id=#{id01}")
/*	@Results(id="userMapId",value={
			@Result(id=true,column="user_id",property="user_id"),
			@Result(column="user_name",property="user_name"),
			@Result(column="user_pwd",property="user_pwd")
	})*/
	public User findById(@Param("id01") Integer user_id);
}
