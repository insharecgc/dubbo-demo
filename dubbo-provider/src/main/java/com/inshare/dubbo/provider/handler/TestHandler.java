package com.inshare.dubbo.provider.handler;

import com.alibaba.dubbo.config.annotation.Service;
import com.inshare.dubbo.common.ResponseResult;
import com.inshare.dubbo.common.ResponseResultUtil;
import com.inshare.dubbo.common.TestApi;
import org.springframework.stereotype.Component;

/**
 * @author Guichao
 * @since 2018/9/23
 */
@Service(interfaceClass = TestApi.class)
@Component
public class TestHandler implements TestApi {

    @Override
    public ResponseResult<String> testService1(long id) {
        return ResponseResultUtil.success(String.format("TestHandler service %d", id));
    }

    @Override
    public ResponseResult<Integer> create(String s) {
        return null;
    }

    @Override
    public ResponseResult<Integer> delete(Long pk) {
        return null;
    }

    @Override
    public ResponseResult<Integer> update(String s) {
        return null;
    }

    @Override
    public ResponseResult<String> get(Long pk) {
        return null;
    }
}
