package com.github.qsl.project.repository.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 基础DAO
 *
 * @author Daniel QIAN
 */
public class BaseDAO<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {

}