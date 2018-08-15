package com.example.shirodemo.common.messages;

import com.example.shirodemo.utils.SpringUtils;
import org.springframework.context.MessageSource;

/**
 * @Method
 * @PACKAGE_NAME com.example.shirodemo.common.messages
 * @Auther player
 * @Date 2018/8/3
 * @Version 1.0
 */
public class MessagesUtils {
    /**
     * 根据消息键和参数 获取消息 委托给spring messageSource
     *
     * @param code 消息键
     * @param args 参数
     * @return
     */
    public static String message(String code, Object... args)
    {
        MessageSource messageSource = SpringUtils.getBean(MessageSource.class);
        System.out.println(messageSource);
        return messageSource.getMessage(code, args, null);
    }
}
