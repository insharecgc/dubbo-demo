package com.inshare.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.inshare.dubbo.common.ResponseResult;
import com.inshare.dubbo.common.TestApi;
import org.springframework.stereotype.Service;

/**
 * @author Guichao
 * @since 2018/9/23
 */
@Service
public class TestService {

    @Reference
    private TestApi testApi;

    public ResponseResult<String> test(long id) {
        return  testApi.testService1(id);
    }
}
