package com.github.qsl.project.repository.dao;

import com.github.qsl.project.repository.entity.DemoDO;
import com.github.qsl.project.repository.mapper.DemoMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

/**
 * Demo DAO层
 *
 * @author Daniel QIAN
 */
@Repository
public class DemoDAO extends BaseDAO<DemoMapper, DemoDO> {

    @Resource
    private DemoMapper demoMapper;

}
