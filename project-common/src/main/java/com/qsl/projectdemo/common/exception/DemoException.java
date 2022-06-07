package com.qsl.projectdemo.common.exception;

import com.qsl.project.base.exception.BaseBizException;
import com.qsl.project.base.model.BaseCommonError;

/**
 * 项目异常类
 *
 * @author DanielQSL
 */
public class DemoException extends BaseBizException {

    private static final long serialVersionUID = 1L;

    public DemoException(Integer errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }

    public DemoException(String errorMsg) {
        super(errorMsg);
    }

    public DemoException(BaseCommonError baseCommonError) {
        super(baseCommonError);
    }

    public DemoException(BaseCommonError baseCommonError, String errorMsg) {
        super(baseCommonError, errorMsg);
    }

}
