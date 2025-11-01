package com.github.qsl.project.repository.dao;

import com.github.qsl.project.repository.entity.DemoDO;
import com.github.qsl.project.repository.mapper.DemoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Demo DAO层
 *
 * @author Daniel QIAN
 */
@Slf4j
@Repository
public class DemoDAO extends BaseDAO<DemoMapper, DemoDO> {

    @Autowired
    private DemoMapper demoMapper;

}
