package com.wan.algorithm;

public class TestAgent {
    public static void main(String[] args) {
        //获得是引导类加载器
        Thread.currentThread().getClass().getClassLoader();
         Thread thread = new Thread(
            ()->{
                System.out.println("111");
            }
        );
        thread.getClass().getClassLoader();
        //获得的是上下文加载器
        ClassLoader c1 = Thread.currentThread().getContextClassLoader();
        ClassLoader c2 = TestAgent.class.getClassLoader();
        System.out.println(c1 == c2);
    }
}
