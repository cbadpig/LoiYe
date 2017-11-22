package com.loiye.art.service.impl;

import com.loiye.art.service.NoteService;
import com.loiye.core.bean.HsWzWj;
import com.loiye.core.mapper.HsWzWjMapper;
import com.loiye.core.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NoteServiceImpl implements NoteService {

    private static final Logger logger = LogManager.getLogger(NoteServiceImpl.class);

    @Autowired
    private HsWzWjMapper hsWzWjMapper;

    @Override
    public Result getWzwj() {
        List<HsWzWj> hsWzWjList = hsWzWjMapper.selectByYh(LyConstant.YH_ID);
        Map<Object,Object> map = new HashMap<Object,Object>();

        if (LyEmpty.list(hsWzWjList)) {
            map.put(LyConstant.NOTE_WJ,null);
        } else {
            putMap(map,hsWzWjList);
        }
        return Result.OK(LyJson.toString(map));
    }

    @Override
    public Result insertWjTitle(String bt) {
        HsWzWj hsWzWj = new HsWzWj();
        hsWzWj.setWjId(0);
        hsWzWj.setWzzt(0);
        hsWzWj.setBt(bt);
        hsWzWj.setWzxh(selectMaxWzxhAdd(1,0));
        hsWzWj.setYhId(1);
        hsWzWjMapper.insertSelective(hsWzWj);
        return Result.OK();
    }

    @Override
    public Result insertWzTile() {
        return null;
    }

    private void putMap(Map<Object,Object> map,List<HsWzWj> hsWzWjList) {

        List<HsWzWj> wjList = new ArrayList<HsWzWj>();

        for (int i=0 ; i<hsWzWjList.size() ; i++) {
            HsWzWj hsWzWj = hsWzWjList.get(i);
            if (hsWzWj.getWjId() == 0) {
                wjList.add(hsWzWj);
            }
        }
        map.put(LyConstant.NOTE_WJ,wjList);

        for (int i=0 ; i<wjList.size() ; i++) {
            HsWzWj wj = wjList.get(i);
            List<HsWzWj> wzList = new ArrayList<HsWzWj>();
            for (int j=0 ; j<hsWzWjList.size() ; j++) {
                HsWzWj wz = hsWzWjList.get(j);
                if (wz.getWjId() == wj.getId()) {
                    wzList.add(wz);
                }
            }
            if (!LyEmpty.list(wzList)) {
                map.put(wj.getId(),wzList);
            }
        }
    }

    private int selectMaxWzxhAdd(int yhId,int wjId) {
        int max = hsWzWjMapper.selectMaxWzxh(yhId,wjId);
        return ++max;
    }

}
