package com.neusoft.portal.common.exception;

/**
 * 异常返回值
 */
public class ErrorCode {

    /**
     * 成功
     */
    public static final int SUCCESS = 1;

    /**
     * 失败
     */
    public static final int FAIL = 0;

    /**
     * 通用异常
     */
    public static final int COMMON_ERROR = 2;

    /**
     * 状态修改判断
     */
    public static final int STATUS = 3;

    /**
     * 状态修改判断操作
     */
    public static final int FAILSTATUS = 4;
    /**
     * 登陆，验证失败
     */
    public static final int LOGIN_WRONG = 30001;


    /**
     * 服务期异常code
     */
    public static final int SERVER_EXCEPTION_CODE = 500;

    /**
     * 服务期异常code
     */
    public static final int IMAGE_EXCEPTION_CODE = 6;

}
