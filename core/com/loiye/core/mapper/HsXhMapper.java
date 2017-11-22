package com.loiye.core.mapper;

import com.loiye.core.bean.HsXh;

public interface HsXhMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HsXh record);

    int insertSelective(HsXh record);

    HsXh selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HsXh record);

    int updateByPrimaryKey(HsXh record);
}