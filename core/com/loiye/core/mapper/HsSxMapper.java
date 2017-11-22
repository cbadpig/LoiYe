package com.loiye.core.mapper;

import com.loiye.core.bean.HsSx;

public interface HsSxMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HsSx record);

    int insertSelective(HsSx record);

    HsSx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HsSx record);

    int updateByPrimaryKeyWithBLOBs(HsSx record);

    int updateByPrimaryKey(HsSx record);
}