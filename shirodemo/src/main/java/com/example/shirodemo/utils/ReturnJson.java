package com.example.shirodemo.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

/**
 * @Method
 * @PACKAGE_NAME com.example.shirodemo.utils
 * @Auther player
 * @Date 2018/8/3
 * @Version 1.0
 */
public class ReturnJson {
    public static JSONObject json = null;

    public static JSONObject success(Object obj,String message){
        json = new JSONObject();
        json.put("success",true);
        if (!StringUtils.isEmpty(message)){
            json.put("info",message);
        }
        json.put("data",obj);
        return json;
    }

    public static JSONObject error(String message){
        json = new JSONObject();
        json.put("success",false);
        json.put("info",message);
        return json;
    }
}
