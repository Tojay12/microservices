package com.example.demo.properties;

import com.zaxxer.hikari.HikariConfig;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 功能描述 日志数据源配置
 *  logType=db时生效(非必须)，如果不配置则使用当前数据源
 * @author jyw
 * @date 2020/10/13
 */
@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "audit-log.datasource")
public class LogDbProperties extends HikariConfig {
}
