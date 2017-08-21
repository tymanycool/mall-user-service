package com.atguigu.util;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class MyPasswordCallBack implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		WSPasswordCallback wscb = (WSPasswordCallback) callbacks[0];

		String identifier = wscb.getIdentifier();

		String pwd = MyPropertyUtil.getProperty("passwordCallBack.properties",identifier);
		
		//MD5加密
		pwd = MD5Util.md5(pwd + MyDateUtil.getMyDate());
		
		System.out.println("pwd:"+pwd);
		wscb.setPassword(pwd);
	}

}
