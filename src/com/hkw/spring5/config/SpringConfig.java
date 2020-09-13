package com.hkw.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 标注为配置类，替代xml配置文件
@ComponentScan(basePackages = "com.hkw") // 开启组件扫描
public class SpringConfig {
}
