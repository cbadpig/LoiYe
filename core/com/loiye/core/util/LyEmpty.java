package com.loiye.core.util;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * 空对象判断工具
 */
public class LyEmpty {

    /**
     * 判断字符串为空
     * @param str
     * @return
     */
    public static boolean string(String str) {
        if (StringUtils.isBlank(str)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断List是否为空
     * @param list
     * @return
     */
    public static boolean list(List list) {
       if (list == null || list.size() == 0) {
            return true;
       }
       return false;
    }

    /**
     * 判断Map是否为空
     * @param map
     * @return
     */
    public static boolean map(Map map) {
        if (map == null || map.size() == 0) {
            return true;
        }
        return false;
    }

}
