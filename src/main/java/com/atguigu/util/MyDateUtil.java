package com.atguigu.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateUtil {

	public static String getMyDate() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");

		String d = sdf.format(new Date());

		return d;
	}

}
