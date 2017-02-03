package com.fansin.mybatis.service;

import com.fansin.mybatis.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaofeng on 17-2-3.
 */
@Service
public class InfoService {

    @Autowired
    private InfoMapper infoMapper;

    public String hello(){
        return "Hello World!";
    }

    public Object findInfo(int age){
        return infoMapper.findInfo(age);
    }

}
