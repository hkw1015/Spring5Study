package com.hkw.spring5.factorybean;

import com.hkw.spring5.collectionType.Course;

/**
 * @ClassName : FactoryBean
 * @Description : 工厂Bean
 * @Author : hkw
 * @Date: 2020-08-21 09:33
 */
public class FactoryBean implements org.springframework.beans.factory.FactoryBean<Course> {

    // 定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setcName("Java程序设计");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
