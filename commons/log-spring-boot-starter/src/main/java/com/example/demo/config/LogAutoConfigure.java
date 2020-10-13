package com.example.demo.config;

import com.example.demo.properties.AuditLogProperties;
import com.example.demo.properties.LogDbProperties;
import com.zaxxer.hikari.HikariConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述 日志自动配置
 *
 * @author jyw
 * @date 2020/10/13
 */
@EnableConfigurationProperties({AuditLogProperties.class})
public class LogAutoConfigure {
    /**
     * 日志数据库配置
     */
    @Configuration
    @ConditionalOnClass(HikariConfig.class)
    @EnableConfigurationProperties(LogDbProperties.class)
    public static class LogDbAutoConfigure {}
}
