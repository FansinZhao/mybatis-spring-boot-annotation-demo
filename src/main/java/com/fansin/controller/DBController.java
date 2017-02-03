package com.fansin.controller;

import com.fansin.mybatis.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaofeng on 17-2-3.
 */
@RestController
public class DBController {

    @Autowired
    private InfoService infoService;

    @RequestMapping("/")
    public String hello(){
        return infoService.hello();
    }

    @RequestMapping("/mybatis")
    public Object mybatis(int age){
        return infoService.findInfo(age);
    }

}
