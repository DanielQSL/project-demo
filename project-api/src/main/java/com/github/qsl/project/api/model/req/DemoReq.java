package com.github.qsl.project.api.model.req;

import lombok.Data;

import java.io.Serializable;

/**
 * Demo请求参数
 *
 * @author Daniel QIAN
 */
@Data
public class DemoReq implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long jobId;

}
