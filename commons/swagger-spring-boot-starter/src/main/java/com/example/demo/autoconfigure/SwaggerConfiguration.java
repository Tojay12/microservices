package com.example.demo.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;

/**
 * 功能描述
 *
 * @author jyw
 * @date 2020/10/12
 */
//在application.（properties或yaml)配置"swagger.enabled"，对应的值为true 可与name组合使用，比较获取到的属性值与havingValue给定的值是否相同，相同才加载配置
@ConditionalOnProperty(name = "swagger.enabled", matchIfMissing = true)
@Import({
        Swagger2DocumentationConfiguration.class //导入swagger文档配置类
})
public class SwaggerConfiguration {
}
