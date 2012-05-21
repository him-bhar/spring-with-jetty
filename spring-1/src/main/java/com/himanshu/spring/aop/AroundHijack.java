package com.himanshu.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundHijack implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("Inside Around Interceptors");
		System.out.println("Invoking method:"+arg0.getMethod().getName());
		Object object = arg0.proceed();
		System.out.println("Invoked method:"+arg0.getMethod().getName());
		return object;
	}

}
