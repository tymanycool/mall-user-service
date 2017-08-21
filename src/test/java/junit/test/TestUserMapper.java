package junit.test;

import org.junit.Test;

import com.atguigu.bean.T_MALL_USER_ACCOUNT;
import com.atguigu.mapper.UserMapper;
import com.atguigu.util.mybatis.MyBatisUtils;
import com.atguigu.util.mybatis.RunTest;

public class TestUserMapper {
	@Test
	public void test(){
		new MyBatisUtils(new RunTest<UserMapper>() {
			@Override
			public void test(UserMapper t) {
				T_MALL_USER_ACCOUNT user = new T_MALL_USER_ACCOUNT();
				user.setYh_mch("zd");
				user.setYh_nch("张东");
				user.setYh_mm("123");
				user.setYh_yx("zd@163.com");
				t.insert_user_account(user);
			}
		});
	}
}
