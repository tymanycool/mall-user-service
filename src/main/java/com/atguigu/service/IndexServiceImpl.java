package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.mapper.IndexMapper;

@Service
public class IndexServiceImpl implements IndexServiceInf {
	
	@Autowired
	IndexMapper indexMapper;
	
	@Override
	public String test(String say) {
		int test = indexMapper.test();
		String result = "你好"+say+"，你查询的结果为："+test;
		System.out.println(result);
		return result;
	}
	
}
