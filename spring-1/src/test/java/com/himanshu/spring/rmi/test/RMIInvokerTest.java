package com.himanshu.spring.rmi.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RMIInvokerTest {
	
	@Test
	public void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("rmi-invoker.xml");
		RMIAccountServiceClient client = (RMIAccountServiceClient)ctx.getBean("accountServiceRMIClient");
		client.pleasePrint();

	}

}
