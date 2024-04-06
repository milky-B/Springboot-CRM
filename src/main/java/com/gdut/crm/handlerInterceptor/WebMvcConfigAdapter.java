package com.gdut.crm.handlerInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootConfiguration
public class WebMvcConfigAdapter implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor authenticationIntercept;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationIntercept)
                .addPathPatterns("/**","/api/report/sp/upload")
                .excludePathPatterns("/settings/qx/user/toLogin.do")
                .excludePathPatterns("/index.do")
                .excludePathPatterns("/index")
                .excludePathPatterns("/")
                //.excludePathPatterns("/manage/user/register")
                .excludePathPatterns("/settings/qx/user/login.do")
                //.excludePathPatterns("/manage/user/wechatLogin")
                .excludePathPatterns("/manage/user/tenantList")
                //.excludePathPatterns("/WW_verify_Csgq5tbGS8Q3eLLL.txt")
                .excludePathPatterns("/swagger-resources/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
    }
}
