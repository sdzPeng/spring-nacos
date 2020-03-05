package com.dist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @company: 上海数慧系统技术有限公司
 * @department: 数据中心
 * @date: 2020-03-05 10:59 下午
 * @author: zhangyp
 * @email: zhangyp@dist.com.cn
 * @desc：
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello world";
    }
}
