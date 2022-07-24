package com.qsl.project.service.impl;

import com.qsl.project.dao.DemoDAO;
import com.qsl.project.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Demo 服务实现层
 *
 * @author DanielQSL
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDAO demoDAO;

}
