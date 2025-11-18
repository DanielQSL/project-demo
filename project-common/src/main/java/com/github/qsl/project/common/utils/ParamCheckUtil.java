package com.github.qsl.project.common.utils;

import com.github.qsl.project.base.enums.ResponseCode;
import com.github.qsl.project.base.exception.BaseBizException;
import com.github.qsl.project.base.model.BaseCommonError;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.Objects;

/**
 * 参数校验工具类
 *
 * @author Daniel QIAN
 */
public class ParamCheckUtil {

    public static void checkObjectNotNull(Object o) throws BaseBizException {
        if (Objects.isNull(o)) {
            throw new BaseBizException(ResponseCode.SERVER_ILLEGAL_ARGUMENT_ERROR);
        }
    }

    public static void checkObjectNotNull(Object o, String errorMsg) throws BaseBizException {
        if (Objects.isNull(o)) {
            throw new BaseBizException(ResponseCode.SERVER_ILLEGAL_ARGUMENT_ERROR, errorMsg);
        }
    }

    public static void checkObjectNotNull(Object o, BaseCommonError baseErrorCodeEnum, Object... arguments) throws BaseBizException {
        if (Objects.isNull(o)) {
            throw new BaseBizException(baseErrorCodeEnum.getErrorCode(), baseErrorCodeEnum.getErrorMsg(), arguments);
        }
    }

    public static void checkStringNotBlank(String str) throws BaseBizException {
        if (StringUtils.isBlank(str)) {
            throw new BaseBizException(ResponseCode.SERVER_ILLEGAL_ARGUMENT_ERROR);
        }
    }

    public static void checkStringNotBlank(String str, String errorMsg) throws BaseBizException {
        if (StringUtils.isBlank(str)) {
            throw new BaseBizException(ResponseCode.SERVER_ILLEGAL_ARGUMENT_ERROR, errorMsg);
        }
    }

    public static void checkStringNotBlank(String str, BaseCommonError baseErrorCodeEnum, Object... arguments) throws BaseBizException {
        if (StringUtils.isBlank(str)) {
            throw new BaseBizException(baseErrorCodeEnum.getErrorCode(), baseErrorCodeEnum.getErrorMsg(), arguments);
        }
    }

    public static void checkCollectionNotEmpty(Collection<?> collection) throws BaseBizException {
        if (CollectionUtils.isEmpty(collection)) {
            throw new BaseBizException(ResponseCode.SERVER_ILLEGAL_ARGUMENT_ERROR);
        }
    }

    public static void checkCollectionNotEmpty(Collection<?> collection, String errorMsg) throws BaseBizException {
        if (CollectionUtils.isEmpty(collection)) {
            throw new BaseBizException(ResponseCode.SERVER_ILLEGAL_ARGUMENT_ERROR, errorMsg);
        }
    }

    public static void checkCollectionNotEmpty(Collection<?> collection, BaseCommonError baseErrorCodeEnum, Object... arguments) throws BaseBizException {
        if (CollectionUtils.isEmpty(collection)) {
            throw new BaseBizException(baseErrorCodeEnum.getErrorCode(), baseErrorCodeEnum.getErrorMsg(), arguments);
        }
    }

}
