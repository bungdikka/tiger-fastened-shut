package com.moonlight.sso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.moonlight.sso.interceptor.GuardInterceptor;

@Configuration
public class TFSWebMvcConfigurer implements WebMvcConfigurer{
	
	@Autowired
	GuardInterceptor guardInterceptor;
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(guardInterceptor);
    }
}
