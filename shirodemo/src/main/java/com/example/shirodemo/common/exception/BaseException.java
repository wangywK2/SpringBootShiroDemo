package com.example.shirodemo.common.exception;

import com.example.shirodemo.common.messages.MessagesUtils;
import org.springframework.util.StringUtils;

/**
 * @Method 基础异常
 * @PACKAGE_NAME com.example.shirodemo.common.exception
 * @Auther player
 * @Date 2018/8/3
 * @Version 1.0
 */
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    /**
     * 所属模块
     */
    private String module;

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误码对应的参数
     */
    private Object[] args;

    public BaseException(String module, String code, Object[] args, String defaultMessage)
    {
        this.module = module;
        this.code = code;
        this.args = args;
        this.defaultMessage = defaultMessage;
    }

    public BaseException(String module, String code, Object[] args)
    {
        this(module, code, args, null);
    }

    public BaseException(String module, String defaultMessage)
    {
        this(module, null, null, defaultMessage);
    }

    public BaseException(String code, Object[] args)
    {
        this(null, code, args, null);
    }

    public BaseException(String defaultMessage)
    {
        this(null, null, null, defaultMessage);
    }
    public BaseException()
    {

    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }

    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    /**
     * 错误消息
     */
    private String defaultMessage;
    @Override
    public String getMessage() {
        String message = null;
        if (!StringUtils.isEmpty(code))
        {
            message = MessagesUtils.message(code, args);
        }
        if (message == null)
        {
            message = defaultMessage;
        }
        return message;
    }

    @Override
    public String toString()
    {
        return this.getClass() + "{" + "module='" + module + '\'' + ", message='" + getMessage() + '\'' + '}';
    }
}
