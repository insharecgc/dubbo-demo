package com.inshare.dubbo.common;

/**
 * @author Guichao
 * @since 2018/9/23
 */
public class ResponseResultUtil {

    public static final ResponseResult success(Object data) {
        return new ResponseResult(200, "success", data);
    }

    public static final ResponseResult error(String msg) {
        return new ResponseResult(-1, msg, null);
    }
}
