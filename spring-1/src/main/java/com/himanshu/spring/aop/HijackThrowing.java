package com.himanshu.spring.aop;

import org.springframework.aop.ThrowsAdvice;

public class HijackThrowing implements ThrowsAdvice {
	public void afterThrowing (NullPointerException npe) {
		System.out.println("Throwing exception");
	}
}
