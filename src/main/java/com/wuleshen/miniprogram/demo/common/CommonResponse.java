package com.wuleshen.miniprogram.demo.common;
import java.io.Serializable;

/**
 * 通用响应类
 * Created by wuleshen on 2019/3/11
 */
public class CommonResponse<T> implements Serializable {

    private boolean success;

    private String msg;

    private T data;

    private CommonResponse(boolean success, String msg, T data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    private CommonResponse(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    private CommonResponse(boolean success) {
        this.success = success;
    }

    public static CommonResponse createSuccess() {
        return new CommonResponse(true, "SUCCESS");
    }

    public static <T> CommonResponse createSuccessData(T data) {
        return new CommonResponse<>(true, "SUCCESS", data);
    }

    public static CommonResponse createSuccess(String msg) {
        return new CommonResponse(true, msg);
    }

    public static CommonResponse createError(String msg) {
        return new CommonResponse(false, msg);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
