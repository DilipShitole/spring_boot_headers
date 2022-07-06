package com.crud2.test.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class BankMvcAdapter extends WebMvcConfigurerAdapter{

	  @Autowired
	  BankServiceInterceptor bankServiceInterceptor;
	  
	  @Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		  registry.addInterceptor(bankServiceInterceptor);
	}
}