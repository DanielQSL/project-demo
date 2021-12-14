package com.qsl.projectdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qsl.projectdemo.entity.DemoDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Demo Mapper层
 *
 * @author DanielQSL
 */
@Mapper
public interface DemoMapper extends BaseMapper<DemoDO> {

}
