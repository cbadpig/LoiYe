package com.loiye.core.mapper;

import com.loiye.core.bean.HsDt;

public interface HsDtMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HsDt record);

    int insertSelective(HsDt record);

    HsDt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HsDt record);

    int updateByPrimaryKey(HsDt record);
}