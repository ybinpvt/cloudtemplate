package com.ybin.casclientspringboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/29 17:03
 * @description:
 */

@Configuration
public class DataSourceConfig {
    /**
     * 数据源驱动类型
     */
    @Value("${spring.datasource.driver-class-name}")
    private String driver;

    /**
     * 连接地址
     */
    @Value("${spring.datasource.url}")
    private String url;

    /**
     * 用户名
     */
    @Value("${spring.datasource.username}")
    private String username;

    /**
     * 密码
     */
    @Value("${spring.datasource.password}")
    private String password;

    /**
     * 配置最大连接
     */
    @Value("${spring.datasource.maxActive}")
    private Integer maxActive;

    /**
     * 配置初始连接
     */
    @Value("${spring.datasource.initialSize}")
    private Integer initialSize;

    /**
     * 配置最小连接
     */
    @Value("${spring.datasource.minIdle}")
    private Integer minIdle;

    /**
     * 配置Druid数据源
     * @return
     * @throws SQLException
     */
    @Bean(name="dataSource",destroyMethod="close",initMethod ="init")
    public DataSource dataSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        //配置最大连接
        dataSource.setMaxActive(maxActive);
        //配置初始连接
        dataSource.setInitialSize(initialSize);
        //配置最小连接
        dataSource.setMinIdle(minIdle);
        //连接等待超时时间
        dataSource.setMaxWait(60000);
        //间隔多久进行检测,关闭空闲连接
        dataSource.setTimeBetweenEvictionRunsMillis(60000);
        //一个连接最小生存时间
        dataSource.setMinEvictableIdleTimeMillis(300000);
        //连接等待超时时间 单位为毫秒 缺省启用公平锁，
        //并发效率会有所下降， 如果需要可以通过配置useUnfairLock属性为true使用非公平锁
        dataSource.setUseUnfairLock(true);
        //用来检测是否有效的sql
        dataSource.setValidationQuery("select 'x'");
        dataSource.setTestWhileIdle(true);
        //申请连接时执行validationQuery检测连接是否有效，配置为true会降低性能
        dataSource.setTestOnBorrow(false);
        //归还连接时执行validationQuery检测连接是否有效，配置为true会降低性能
        dataSource.setTestOnReturn(false);
        return dataSource;
    }
}
