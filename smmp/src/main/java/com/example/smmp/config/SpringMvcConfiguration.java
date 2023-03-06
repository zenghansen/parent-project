package com.example.smmp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import zhs.com.ip_spring_boot_starter.interceptor.IpCountInterceptor;

@Configuration
public class SpringMvcConfiguration implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(ipCountInterceptor()).addPathPatterns("/**");

    }

    @Bean
    public IpCountInterceptor ipCountInterceptor(){
        return new IpCountInterceptor();
    }
}
