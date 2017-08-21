package com.atguigu.mapper;

import com.atguigu.bean.T_MALL_USER_ACCOUNT;

public interface UserMapper {

	T_MALL_USER_ACCOUNT select_user_account(T_MALL_USER_ACCOUNT user);

	int insert_user_account(T_MALL_USER_ACCOUNT user);
}
