package com.jiuling.controller;

import com.jiuling.feignclient.ServiceAFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanxiaoming on 2018/7/31.
 */
@RestController
public class TestController {

    @Autowired
    private ServiceAFeignClient serviceAFeignClient;
    @RequestMapping(name = "test")
    public String test(){
        for(int i=0;i<100;i++){
            String result = serviceAFeignClient.testFeign();
            System.out.println(result);
        }
        return "success";
    }
}
