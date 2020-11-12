package com.ybin.shiroredis.config;//package com.ybin.shirodemo.config;
//
//import com.alibaba.druid.support.http.StatViewServlet;
//import com.alibaba.druid.support.http.WebStatFilter;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.servlet.Filter;
//import javax.servlet.Servlet;
//
///**
// * @author ybin
// * @version 1.0
// * @date 2020/11/3 9:12
// * @description: Druid配置类
// */
//
//@Configuration
//public class DruidConfig {
//
//    @Bean
//    public ServletRegistrationBean druidServletRegistrationBean() {
//
//        ServletRegistrationBean<Servlet> servletRegistrationBean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
//        //白名单
//        servletRegistrationBean.addInitParameter("allow", "");
//        //黑名单
//        //servletRegistrationBean.addInitParameter("deny","192.168.0.9");
//        //超级管理员 用户名 密码
//        servletRegistrationBean.addInitParameter("loginUsername", "admin");
//        servletRegistrationBean.addInitParameter("loginPassword", "admin");
//        //是否能够重置数据  禁用HTML的 reset all 功能
//        servletRegistrationBean.addInitParameter("resetEnable", "false");
//        return servletRegistrationBean;
//    }
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//
//        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>(new WebStatFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        filterRegistrationBean.addInitParameter("exclusions", ".js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//        return filterRegistrationBean;
//    }
//}
