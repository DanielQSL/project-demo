package com.qsl.project.dao;

import com.qsl.project.mapper.DemoMapper;
import com.qsl.project.model.entity.DemoDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Demo DAO层
 *
 * @author DanielQSL
 */
@Slf4j
@Repository
public class DemoDAO extends BaseDAO<DemoMapper, DemoDO> {

    @Autowired
    private DemoMapper demoMapper;

}
