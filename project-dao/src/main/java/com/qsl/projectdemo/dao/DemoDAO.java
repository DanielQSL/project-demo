package com.qsl.projectdemo.dao;

import com.qsl.projectdemo.entity.DemoDO;
import com.qsl.projectdemo.mapper.DemoMapper;
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
