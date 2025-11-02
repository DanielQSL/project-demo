package com.github.qsl.project.admin.service.impl;

import com.github.qsl.project.admin.service.DemoService;
import com.github.qsl.project.repository.dao.DemoDAO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Demo 服务实现层
 *
 * @author Daniel QIAN
 */
@Slf4j
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoDAO demoDAO;

}
