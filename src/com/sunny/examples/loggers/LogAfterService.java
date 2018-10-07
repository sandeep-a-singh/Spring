package com.sunny.examples.loggers;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterService implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnObject, Method method, Object[] params, Object object) throws Throwable {
		System.out.println(method.getName()+"  "+Arrays.asList(params)+"  "+ object.getClass().getName()+"  "+returnObject);

	}

}
