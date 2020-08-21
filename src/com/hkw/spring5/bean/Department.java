package com.hkw.spring5.bean;

/**
 * @ClassName : Department
 * @Description : 部门类
 * @Author : hkw
 * @Date: 2020-08-20 10:58
 */
public class Department {
    private String dName;

    public void setdName(String dName) {
        this.dName = dName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dName='" + dName + '\'' +
                '}';
    }
}
