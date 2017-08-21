package junit.test;

import org.junit.Test;

import com.atguigu.mapper.IndexMapper;
import com.atguigu.util.mybatis.MyBatisUtils;
import com.atguigu.util.mybatis.RunTest;

public class TestIndexMapper {
	@Test
	public void test(){
		new MyBatisUtils(new RunTest<IndexMapper>() {
			@Override
			public void test(IndexMapper t) {
				int test = t.test();
				System.out.println(test);
			}
		});
	}
}
