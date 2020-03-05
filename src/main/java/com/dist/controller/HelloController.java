package com.dist.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
@RequestMapping("hello")
public class HelloController {

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private String useLocalCache;

    @GetMapping("/sayHello")
    @ResponseBody
    public String sayHello() {
        System.out.println("test");
        return useLocalCache;
    }
}
