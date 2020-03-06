package com.dist.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

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
@Api("swaggerDemoController相关的api")
public class HelloController {

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private String useLocalCache;

    @GetMapping("/sayHello")
    @ResponseBody
    public String sayHello() {
        System.out.println("test");
        return useLocalCache;
    }


    /**
     * 多文件上传
     * @param file 文件
     * @return
     */
    @ApiOperation(value = "文件上传", notes = "文件上传支持多文件上传")
    @PostMapping(value = "/fileUpload", headers = "content-type=multipart/form-data")
    public Long uploadFiles(@RequestParam("file") MultipartFile[] file) {
        for (MultipartFile multipartFile : file) {
            System.out.println(multipartFile.getName());
        }

        return Arrays.stream(file).count();

    }
}
