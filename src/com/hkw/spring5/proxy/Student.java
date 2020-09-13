package com.hkw.spring5.proxy;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public void add() {
        System.out.println("add ... ");
//        int i = 10 / 0;
    }
}
