package com.ethan.config;

import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class test {

    public static void main(String[] args) {

        String prefix[] = new String[]{"t"};

        String name = NamingStrategy.removePrefixAndCamel("t_user", prefix);
        System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1));
    }
}
