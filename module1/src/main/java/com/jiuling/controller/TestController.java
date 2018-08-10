package com.jiuling.controller;

import com.jiuling.feignclient.ServiceAFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanxiaoming on 2018/7/31.
 */
@Api(value="/users", tags="用戶接口模块")
@RestController
@RequestMapping(value="/users")
public class TestController {

    @Autowired
    private ServiceAFeignClient serviceAFeignClient;

    @ApiOperation("获取列表")
    @GetMapping("list")
    public String test(){
        for(int i=0;i<100;i++){
            String result = serviceAFeignClient.testFeign();
            System.out.println(result);
        }
        return "success";
    }
}
