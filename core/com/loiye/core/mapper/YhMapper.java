package com.loiye.core.mapper;

import com.loiye.core.bean.Yh;

public interface YhMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Yh record);

    int insertSelective(Yh record);

    Yh selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Yh record);

    int updateByPrimaryKey(Yh record);
}