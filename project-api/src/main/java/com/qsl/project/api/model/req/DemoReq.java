package com.qsl.project.api.model.req;

import lombok.Data;

import java.io.Serializable;

/**
 * Demo请求参数
 *
 * @author DanielQSL
 */
@Data
public class DemoReq implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long jobId;

}
