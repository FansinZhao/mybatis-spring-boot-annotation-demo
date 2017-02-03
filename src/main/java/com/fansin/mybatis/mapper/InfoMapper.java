package com.fansin.mybatis.mapper;

import com.fansin.mybatis.domain.Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zhaofeng on 17-2-3.
 */
@Mapper
public interface InfoMapper {

    @Select("SELECT id, name, age FROM info where age = #{age}")
    List<Info> findInfo(int age);
}
