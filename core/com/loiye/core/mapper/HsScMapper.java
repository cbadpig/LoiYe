package com.loiye.core.mapper;

import com.loiye.core.bean.HsSc;

public interface HsScMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HsSc record);

    int insertSelective(HsSc record);

    HsSc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HsSc record);

    int updateByPrimaryKey(HsSc record);
}