package com.inshare.dubbo.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Guichao
 * @since 2018/9/23
 */
@Data
public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = -5474899111644882155L;

    private int code;

    private String msg;

    private T data;

    public ResponseResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
