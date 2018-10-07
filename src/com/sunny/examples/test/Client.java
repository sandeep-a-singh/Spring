package com.sunny.examples.test;

import java.math.BigDecimal;

import org.springframework.aop.framework.ProxyFactoryBean;

import com.sunny.examples.loggers.LogAfterService;
import com.sunny.examples.loggers.LogBeforeService;
import com.sunny.examples.main.Bank;

public class Client {
public static void main(String[] args) {
	Bank bank = new Bank();
	LogBeforeService logBeforeService = new LogBeforeService();
	LogAfterService  logAfterService = new LogAfterService();
	ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
	proxyFactoryBean.addAdvice(logBeforeService);
	proxyFactoryBean.addAdvice(logAfterService);
	proxyFactoryBean.setTarget(bank);
	
	
	Bank bankProxy= (Bank)proxyFactoryBean.getObject();
	bankProxy.deposit("54654564",new BigDecimal(546546.56));
	
}
}
