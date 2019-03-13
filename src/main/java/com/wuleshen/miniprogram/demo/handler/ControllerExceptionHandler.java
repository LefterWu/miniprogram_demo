package com.wuleshen.miniprogram.demo.handler;

import com.wuleshen.miniprogram.demo.common.CommonResponse;
import com.wuleshen.miniprogram.demo.exception.IllegalAreaArgumentException;
import com.wuleshen.miniprogram.demo.exception.OperationAreaException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller层异常处理
 * Created by wuleshen on 2019/3/13
 */
// 使用 @ControllerAdvice + @ExceptionHandler 进行全局的 Controller 层异常处理，不用在 Controller 层进行 try-catch
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(IllegalAreaArgumentException.class)
    @ResponseBody
    private CommonResponse handleIllegalAreaArgumentException(Exception e) {
        return CommonResponse.createError(e.getMessage());
    }

    @ExceptionHandler(OperationAreaException.class)
    @ResponseBody
    private CommonResponse handleOperationAreaException(Exception e) {
        return CommonResponse.createError(e.getMessage());
    }
}
