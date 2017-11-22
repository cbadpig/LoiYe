package com.loiye.core.mapper;

import com.loiye.core.bean.HsPl;

public interface HsPlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HsPl record);

    int insertSelective(HsPl record);

    HsPl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HsPl record);

    int updateByPrimaryKeyWithBLOBs(HsPl record);

    int updateByPrimaryKey(HsPl record);
}