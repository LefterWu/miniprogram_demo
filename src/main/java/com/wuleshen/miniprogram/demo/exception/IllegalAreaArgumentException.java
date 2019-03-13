package com.wuleshen.miniprogram.demo.exception;

/**
 * 区域参数异常
 * Created by wuleshen on 2019/3/13
 */
public class IllegalAreaArgumentException extends RuntimeException{

    public IllegalAreaArgumentException() {
    }

    public IllegalAreaArgumentException(String message) {
        super(message);
    }
}
