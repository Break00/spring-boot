package com.jason.lee.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 19047589 Jason Lee
 * @description
 * @date 2020/9/28
 */
@MapperScan("com.jason.lee.mapper")
@Configuration
public class MyBatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        // 开启驼峰命名规则
        return (configuration) -> configuration.setMapUnderscoreToCamelCase(true);
    }
}
