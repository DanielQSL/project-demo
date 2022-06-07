package com.qsl.projectdemo.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qsl.projectdemo.repository.entity.DemoDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Demo Mapper层
 *
 * @author DanielQSL
 */
@Mapper
public interface DemoMapper extends BaseMapper<DemoDO> {

}
