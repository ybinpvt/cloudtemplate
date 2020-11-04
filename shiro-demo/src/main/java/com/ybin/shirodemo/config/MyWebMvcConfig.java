package com.ybin.shirodemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/30 17:05
 * @description: SpringMVC的配置文件
 */

@Configuration
public class MyWebMvcConfig extends WebMvcConfigurerAdapter {
    /**
     * 设置自己的path匹配规则
     * @param configurer
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        super.configurePathMatch(configurer);
        // 常用的两种
        // 匹配结尾 / :会识别 url 的最后一个字符是否为 /
        // 设置为true: localhost:8080/test 与 localhost:8080/test/ 等价
        configurer.setUseTrailingSlashMatch(true);
        // 匹配后缀名：会识别 xx.* 后缀的内容
        // 设置为true: localhost:8080/test 与 localhost:8080/test.jsp 等价
        configurer.setUseSuffixPatternMatch(true);
    }


    /**
     * 静态资源映射
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/templates/**")
                .addResourceLocations("classpath:/templates/");
    }
}
