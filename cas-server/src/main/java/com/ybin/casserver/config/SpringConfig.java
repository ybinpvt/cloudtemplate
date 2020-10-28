package com.ybin.casserver.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/28 15:37
 * @description:
 *   这个配置是空值,是为了让spring 加载 这个包下 标注了  @Service @Component @Controller 等注解的Bean
 *   并需要在resource/META-INF/spring.factories 中配置
 */

@Configuration
@ComponentScan("com.ybin.casserver")
public class SpringConfig {
}
