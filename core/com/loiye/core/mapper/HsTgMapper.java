package com.loiye.core.mapper;

import com.loiye.core.bean.HsTg;

public interface HsTgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HsTg record);

    int insertSelective(HsTg record);

    HsTg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HsTg record);

    int updateByPrimaryKey(HsTg record);
}