package com.loiye.core.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

public class LyJson implements Serializable {

    private static final long serialVersionUID = 6492988606741655015L;

    private final static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * jackson的一些配置
     */
    static {}

    public LyJson() {}

    /**
     * 将对象转为JSON字符串
     * @param obj
     * @return
     */
    public static String toString(Object obj) {
        String str = null;
        try {
            str = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 将json字符串转为对象
     * @param json
     * @param var
     * @param <T>
     * @return
     */
    public static <T> T toObject(String json, Class<T> var) {
        T t = null;
        try {
            t = objectMapper.readValue(json, var);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

}
