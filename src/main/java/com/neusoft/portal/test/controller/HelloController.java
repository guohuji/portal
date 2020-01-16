package com.neusoft.portal.test.controller;

import com.neusoft.portal.test.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@Api(description = "hello测试")
public class HelloController {

    @Resource
    HelloService helloService;

    @RequestMapping("hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("selectHello")
    @ApiOperation(value = "测试")
    public Map<String,Object> selectHello() {
        return helloService.selectHello();
    }
}
