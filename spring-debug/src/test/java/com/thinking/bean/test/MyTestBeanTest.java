package com.thinking.bean.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Administrator
 */
class MyTestBeanTest {

	@Test
	void testSimpleLoad() {
		BeanFactory bf = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(bean.getTestStr().equals("testStr"));
	}
}