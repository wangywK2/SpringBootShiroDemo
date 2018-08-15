package com.example.shirodemo.common.cache;

import org.springframework.util.StringUtils;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 本地项目缓存 工具类
 * @Method
 * @PACKAGE_NAME com.example.shirodemo.common.cache
 * @Auther player
 * @Date 2018/8/10
 * @Version 1.0
 */
public class CacheTool {
    public static ConcurrentHashMap mapCache = new ConcurrentHashMap();
    static CacheTool tool = new CacheTool();
    //构造方法私有化
    private CacheTool() {

    }
    public static CacheTool newCasheTool(){
        if(tool == null){
            tool = new CacheTool();
        }
        return tool;
    }
    /**
     * 加入缓存
     * @param key
     * @param obj
     * @return
     */
    public boolean put(String key,Object obj){
        boolean bool = true;
        if (StringUtils.isEmpty(key)){
            bool = false;
        }else{
            mapCache.put(key,obj);
        }
        return  bool;
    }

    /**
     * 取数据
     * @param key
     * @return
     */
    public Object get(String key){
        return mapCache.get(key);
    }

    /**
     * 根据 key 值 移除缓存
     * @param key
     */
    public boolean remove(String key){
       boolean bool = true;
        try {
            if (mapCache.containsKey(key)) {
                mapCache.remove(key);
            }
        } catch (Exception e) {
            bool = false;
        }
        return bool;
    }

    /**
     * 清空缓存
     */
    public void removeAll(){
        mapCache.clear();
    }


}
