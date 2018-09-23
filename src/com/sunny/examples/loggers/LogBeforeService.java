package com.sunny.examples.loggers;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeService implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] params, Object object) throws Throwable {
		
		
	}

}
