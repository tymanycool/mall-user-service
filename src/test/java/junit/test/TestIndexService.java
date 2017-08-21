package junit.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

import com.atguigu.service.IndexServiceInf;

public class TestIndexService {
	@Test
	public void test(){
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setAddress("http://localhost:8080/mall-user-service/test?wsdl");
		jaxWsProxyFactoryBean.setServiceClass(IndexServiceInf.class);
		IndexServiceInf indexServiceInf = (IndexServiceInf)jaxWsProxyFactoryBean.create();
		System.out.println(indexServiceInf.test("tianyao"));
	}
}
