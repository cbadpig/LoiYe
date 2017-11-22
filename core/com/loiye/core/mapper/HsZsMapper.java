package com.loiye.core.mapper;

import com.loiye.core.bean.HsZs;

public interface HsZsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HsZs record);

    int insertSelective(HsZs record);

    HsZs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HsZs record);

    int updateByPrimaryKey(HsZs record);
}