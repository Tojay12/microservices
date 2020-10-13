package com.example.demo.annotation;

import java.lang.annotation.*;

/**
 * 功能描述
 *
 * @author jyw
 * @date 2020/10/13
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuditLog {
    /**
     * 操作信息
     */
    String operation();
}