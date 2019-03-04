package com.demo.springboot.mapper;

import com.demo.springboot.domain.Demo;

public interface DemoMapper {

    int deleteByPrimaryKey(Long id);


    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Demo record);

}