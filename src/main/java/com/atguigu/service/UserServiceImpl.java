package com.atguigu.service;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.atguigu.bean.T_MALL_USER_ACCOUNT;
import com.atguigu.mapper.UserMapper;
import com.atguigu.util.MySwitchKey;



@Service
public class UserServiceImpl implements UserServiceInf{
	@Autowired
	UserMapper userMapper;
	
	
	@GET
	@Path("/login_test")
	@Produces("application/json;charset=utf-8")
	@Consumes("application/x-www-form-urlencoded")
  //  @PathParam("hello") String hello
	public String get_user_account_rest(@BeanParam T_MALL_USER_ACCOUNT user) {
		System.out.println("开始认证用户~~~");
		MySwitchKey.setKey("mall");
		
		T_MALL_USER_ACCOUNT db_user = userMapper.select_user_account(user);
		System.out.println("结束认证用户~~~");
		return JSON.toJSONString(db_user);
	}
	
	
	public T_MALL_USER_ACCOUNT get_user_account(T_MALL_USER_ACCOUNT user) {
		System.out.println("开始认证用户~~~");
		MySwitchKey.setKey("mall");
		
		T_MALL_USER_ACCOUNT db_user = userMapper.select_user_account(user);
		System.out.println("结束认证用户~~~");
		return db_user;
	}
	
	public boolean regist(T_MALL_USER_ACCOUNT user){
		if(user!=null){
			int count = userMapper.insert_user_account(user);
			return count > 0;
		}
		return false;
	}
}
