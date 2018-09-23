package com.inshare.dubbo.consumer.controller;

import com.inshare.dubbo.common.ResponseResult;
import com.inshare.dubbo.consumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guichao
 * @since 2018/9/23
 */
@RequestMapping("/dubbo")
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public ResponseResult test(@RequestParam("id") long id) {
        return  testService.test(id);
    }
}
