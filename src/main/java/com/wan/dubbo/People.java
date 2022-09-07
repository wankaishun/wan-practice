package com.wan.dubbo;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author wan
 * @Description: 人类
 * @date 2021/6/8 10:45
 */
@SPI
public interface People {
     void say();
}
