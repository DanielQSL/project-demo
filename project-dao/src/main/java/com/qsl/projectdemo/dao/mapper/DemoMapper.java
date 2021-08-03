package com.qsl.projectdemo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qsl.projectdemo.dao.entity.DemoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * Demo Mapper层
 *
 * @author DanielQSL
 */
@Mapper
public interface DemoMapper extends BaseMapper<DemoEntity> {

}
