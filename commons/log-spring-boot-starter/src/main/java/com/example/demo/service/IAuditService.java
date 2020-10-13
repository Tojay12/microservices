package com.example.demo.service;

import com.example.demo.model.Audit;

/**
 * 功能描述 日志接口
 *
 * @author jyw
 * @date 2020/10/13
 */
public interface IAuditService {
    void save(Audit audit);
}
