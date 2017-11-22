package com.loiye.core.mapper;

import com.loiye.core.bean.HsDz;

public interface HsDzMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HsDz record);

    int insertSelective(HsDz record);

    HsDz selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HsDz record);

    int updateByPrimaryKey(HsDz record);
}