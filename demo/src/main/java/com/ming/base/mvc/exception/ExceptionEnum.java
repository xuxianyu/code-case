package com.ming.base.mvc.exception;


import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * 错误码表
 *
 * @author ming
 * @date 2017-07-16
 */
@Getter
public enum ExceptionEnum {
    /**
     *系统异常
     * */
    SYSTEM_ERROR(1, HttpStatus.INTERNAL_SERVER_ERROR, "系统异常");

    private Integer code;
    private HttpStatus httpStatus;
    private String msg;


    ExceptionEnum(Integer code, HttpStatus httpStatus, String msg) {
        this.code = code;
        this.httpStatus = httpStatus;
        this.msg = msg;
    }
}