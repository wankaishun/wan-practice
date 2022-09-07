package com.wan.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;
public class TestSpi {
    public static void main(String[] args) {
        ExtensionLoader<People> extensionLoader =
                ExtensionLoader.getExtensionLoader(People.class);
        People man = extensionLoader.getExtension("man");
        man.say();
        People woman = extensionLoader.getExtension("woman");
        woman.say();
    }
}
