package com.wuleshen.miniprogram.demo.exception;

/**
 * 操作区域异常
 * Created by wuleshen on 2019/3/13
 */
public class OperationAreaException extends RuntimeException {

    public OperationAreaException() {
    }

    public OperationAreaException(String message) {
        super(message);
    }
}
