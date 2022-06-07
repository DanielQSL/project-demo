package com.qsl.projectdemo.api.model.resp;

import lombok.Data;

import java.io.Serializable;

/**
 * Demo响应结果
 *
 * @author DanielQSL
 */
@Data
public class DemoResp implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long jobId;

}
