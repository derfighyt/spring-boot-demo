package com.liuli.springboot.demo.configuration;

import com.liuli.springboot.demo.web.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器配置
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TokenInterceptor())
        .addPathPatterns("/**");
        //super.addInterceptors(registry);
    }
}
