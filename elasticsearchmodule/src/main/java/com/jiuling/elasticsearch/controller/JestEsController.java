package com.jiuling.elasticsearch.controller;

import com.jiuling.elasticsearch.model.Entity;
import com.jiuling.elasticsearch.service.CityESService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanxiaoming on 2018/7/16.
 */
@RestController
@RequestMapping(value = "es")
public class JestEsController {
    @Autowired
    private CityESService cityESService;

    @RequestMapping(value = "addCity")
    public void getUser(){
         cityESService.saveEntity(new Entity(1l,"tets22"));
    }
}
