package com.wan.dubbo;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.utils.ReferenceConfigCache;
import org.apache.dubbo.rpc.service.GenericService;

/**
 * @author wan
 * @Description: 泛化调用
 * @date 2021/6/3 14:23
 */
public class DubboInvoker {
    public static void main(String[] args) {
        // 普通编码配置方式
        ApplicationConfig application = new ApplicationConfig();
        application.setName("dubbo-wan");

        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://zk1-test.d.shunguang.com:2181");

        ReferenceConfig<GenericService> reference = new ReferenceConfig<GenericService>();
        reference.setApplication(application);
        reference.setRegistry(registry);
        reference.setInterface("com.ehaier.cbs.orderrepair.jobapi.MtestJobApi");
        reference.setGeneric(true); // 声明为泛化接口

        ReferenceConfigCache cache = ReferenceConfigCache.getCache();
        GenericService genericService = cache.get(reference);

        // 基本类型以及Date,List,Map等不需要转换，直接调用
        Object result = genericService.$invoke("lets", new String[] {},
                new Object[] {});
        System.out.println(result);

    }
}
