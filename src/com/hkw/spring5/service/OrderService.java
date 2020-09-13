package com.hkw.spring5.service;

import org.springframework.stereotype.Component;

// 注解里面的value属性值可以省略不写
// 默认值是类名称的首字母小写 例：OrderService -> orderService
@Component(value = "orderService")
public class OrderService {
    public void add() {
        System.out.println("OrderService add ... ");
    };
}
