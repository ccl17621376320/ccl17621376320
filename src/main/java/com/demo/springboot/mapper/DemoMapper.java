package com.demo.springboot.mapper;

import com.demo.springboot.domain.Demo;
import com.demo.springboot.domain.repository.DemoRepository;

public interface DemoMapper {

    DemoRepository selectDemoRepositoryByPrimaryKey(Long demoId);

    int deleteByPrimaryKey(Long id);


    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Demo record);

}