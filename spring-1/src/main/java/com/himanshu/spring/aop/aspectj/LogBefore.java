package com.himanshu.spring.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogBefore {
	@Before("execution(* com.himanshu.spring.*.*.*.*(..))")
	public void logBefore(JoinPoint joinPoint) {
 
		System.out.println("FFFFFFFFFFFFFFFFFlogBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
}
