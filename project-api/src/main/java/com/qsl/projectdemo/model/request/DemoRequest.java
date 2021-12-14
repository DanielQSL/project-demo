package com.qsl.projectdemo.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * Demo请求参数
 *
 * @author DanielQSL
 */
@Data
public class DemoRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long jobId;

}
