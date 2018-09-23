package com.inshare.dubbo.common;

/**
 * @author Guichao
 * @since 2018/9/23
 */
public interface TestApi extends BaseService<String>{

    public ResponseResult<String> testService1(long id);
}
