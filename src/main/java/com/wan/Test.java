package com.wan;

import java.util.Optional;

/**
 * @author wan
 * @Description:
 * @date 2022/4/21 10:07
 */
public class Test {
    public static void main(String[] args) {
        User user = null;
        System.out.println(Optional.ofNullable(user).map(User::getName).orElse("--"));
    }
    static class User{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
