package com.wuleshen.miniprogram.demo.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * 事务管理配置
 * Created by wuleshen on 2019/3/11
 */
@Configuration
@EnableTransactionManagement
public class TransactionManagementConfiguration implements TransactionManagementConfigurer {

    // 根据yml，com.alibaba.druid.spring.boot.autoconfigure自动配置的数据源
    @Qualifier("dataSource")
    @Autowired
    private DataSource dateSource;

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dateSource);
    }
}
