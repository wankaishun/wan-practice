package com.wan.caffeine;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * @author wan
 * @Description:
 * @date 2022/7/14 9:56
 */
public class CaffeineTest {
    /**
     * 手动加载
     * @param key
     * @return
     */
    public static  Object manulOperator(String key) {
        Cache<String, Object> cache = Caffeine.newBuilder()
                .expireAfterWrite(1, TimeUnit.SECONDS)
                .expireAfterAccess(1, TimeUnit.SECONDS)
                .maximumSize(10)
                .build();
        //如果一个key不存在，那么会进入指定的函数生成value
        Object value = cache.get(key, t -> setValue(key).apply(key));
        cache.put("hello",value);

        //判断是否存在如果不存返回null
        Object ifPresent = cache.getIfPresent(key);
        //移除一个key
        cache.invalidate(key);
        return value;
    }

    public static Function<String, Object> setValue(String key){
        return t -> key + "value";
    }
    public Object syncOperator(String key){
        LoadingCache<String, Object> cache = Caffeine.newBuilder()
                .maximumSize(100)
                .expireAfterWrite(1, TimeUnit.MINUTES)
                .build(k -> setValue(key).apply(key));
        return cache.get(key);
    }

    public static void main(String[] args) {
        manulOperator("12");
    }
}
