package com.hkw.spring5.collectionType;

/**
 * @ClassName : Course
 * @Description : 课程类
 * @Author : hkw
 * @Date: 2020-08-20 13:38
 */
public class Course {
    private String cName;

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cName='" + cName + '\'' +
                '}';
    }
}
