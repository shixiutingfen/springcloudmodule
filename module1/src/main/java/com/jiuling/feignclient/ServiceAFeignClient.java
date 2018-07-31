package com.jiuling.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fanxiaoming on 2018/7/31.
 */
@Component
@FeignClient(value = "mybatiesmodule") //这里的name对应调用服务的spring.applicatoin.name
public interface ServiceAFeignClient {

    @RequestMapping(value = "/user/getUser")
    String getUser();
    @RequestMapping(value = "/user/testFeign")
    String testFeign();
}
