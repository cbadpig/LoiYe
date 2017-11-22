package com.loiye.core.util;

import java.io.Serializable;

/**
 * 返回对象封装
 */
public class Result implements Serializable{
    private static final long serialVersionUID = -737793806285934421L;

    private static final boolean FLAG_Y = true;
    private static final boolean FLAG_N = false;

    /**
     * 0:无状态，> 0 : 返回正常的状态码 ， < 0 ：返回异常时的状态码
     */
    private static final int CODE_NONE = 0;

    public boolean flag;
    private int code;
    private Object message;

    //=======================封装方法开始==============================

    public static Result OK() {
        Result result = new Result();
        result.flag = FLAG_Y;
        result.code = CODE_NONE;
        return result;
    }

    public static Result OK(Object message) {
        Result result = new Result();
        result.flag = FLAG_Y;
        result.code = CODE_NONE;
        result.message = message;
        return result;
    }

    public static Result ERROR() {
        Result result = new Result();
        result.flag = FLAG_N;
        result.code = CODE_NONE;
        return result;
    }

    public static Result ERROR(int code) {
        Result result = new Result();
        result.flag = FLAG_N;
        result.code = code;
        return result;
    }

    public static Result ERROR(Object message) {
        Result result = new Result();
        result.flag = FLAG_N;
        result.message = message;
        return result;
    }

    public static Result ERROR(int code,Object message) {
        Result result = new Result();
        result.flag = FLAG_N;
        result.code = code;
        result.message = message;
        return result;
    }

    //=======================封装方法结束==============================

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
