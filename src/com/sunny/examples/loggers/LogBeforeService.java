package com.sunny.examples.loggers;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeService implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] params, Object object) throws Throwable {
		System.out.println(method.getName()+"  "+Arrays.asList(params)+"  "+ object.getClass().getName());
		
	}

}
