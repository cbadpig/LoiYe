package com.loiye.core.mapper;

import com.loiye.core.bean.HsWzWj;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HsWzWjMapper {

    /**
     * 根据用户id，查询出该用户的所有文章文集
     * @param yhId
     * @return
     */
    List<HsWzWj> selectByYh(Integer yhId);

    /**
     * 查询出最大的Wzxh
     * @param yhId
     * @return
     */
    int selectMaxWzxh(@Param("yhId") Integer yhId, @Param("wjId") Integer wjId);

    int insertSelective(HsWzWj hsWzWj);
    
    int wzxhAllAddOne(@Param("yhId") Integer yhId, @Param("wjId") Integer wjId);

//    int deleteByPrimaryKey(Integer id);
//
//    int insert(HsWzWj record);DS
//
//    int insertSelective(HsWzWj record);
//
//    HsWzWj selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(HsWzWj record);
//
//    int updateByPrimaryKeyWithBLOBs(HsWzWj record);
//
//    int updateByPrimaryKey(HsWzWj record);
}