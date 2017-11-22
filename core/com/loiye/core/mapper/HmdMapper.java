package com.loiye.core.mapper;

import com.loiye.core.bean.Hmd;

public interface HmdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hmd record);

    int insertSelective(Hmd record);

    Hmd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hmd record);

    int updateByPrimaryKey(Hmd record);
}