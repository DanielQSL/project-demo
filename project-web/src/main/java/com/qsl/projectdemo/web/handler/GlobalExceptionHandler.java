package com.qsl.projectdemo.web.handler;

import com.qsl.projectdemo.common.core.CommonResponse;
import com.qsl.projectdemo.common.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.stream.Collectors;

/**
 * 全局异常处理
 *
 * @author DanielQSL
 */
@Slf4j
@RestControllerAdvice(annotations = {RestController.class, Controller.class})
public class GlobalExceptionHandler {

    /**
     * 处理Get请求中验证路径中请求实体校验失败后抛出的异常
     *
     * @param ex 异常
     * @return 响应结果
     */
    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResponse bindExceptionHandler(BindException ex) {
        String errorMsg = ex.getBindingResult().getAllErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.joining(";", "", ""));
        return CommonResponse.fail(errorMsg);
    }

    /**
     * 处理请求参数格式错误@RequestParam上validate失败后抛出的异常
     *
     * @param ex 异常
     * @return 响应结果
     */
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResponse constraintViolationExceptionHandler(ConstraintViolationException ex) {
        String errorMsg = ex.getConstraintViolations().stream()
                .map(ConstraintViolation::getMessage)
                .collect(Collectors.joining(";", "", ""));
        return CommonResponse.fail(errorMsg);
    }

    /**
     * 处理请求参数格式错误 @RequestBody上validate失败后抛出的异常
     *
     * @param ex 异常
     * @return 响应结果
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResponse methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException ex) {
        String errorMsg = ex.getBindingResult().getAllErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.joining(";", "", ""));
        return CommonResponse.fail(errorMsg);
    }

    /**
     * 捕获业务异常
     *
     * @param request 请求
     * @param ex      业务异常
     * @return 响应结果
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseStatus(HttpStatus.OK)
    public CommonResponse bizExceptionHandler(HttpServletRequest request, final BizException ex) {
        log.warn("{} 业务异常", request.getRequestURI(), ex);
        return CommonResponse.fail(ex.getCode(), ex.getMessage());
    }

    /**
     * 捕获其他异常
     *
     * @param request 请求
     * @param ex      异常
     * @return 响应结果
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CommonResponse otherExceptionHandler(HttpServletRequest request, final Exception ex) {
        log.error("{} 系统异常", request.getRequestURI(), ex);
        return CommonResponse.fail(ex.getMessage());
    }

}

