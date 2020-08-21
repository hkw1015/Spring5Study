package com.hkw.spring5.bean;

/**
 * @ClassName : Employee
 * @Description : 员工类
 * @Author : hkw
 * @Date: 2020-08-20 10:59
 */
public class Employee {
    private String name;
    private String gender;
    private Department department;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                '}';
    }

    public Department getDepartment() {
        return department;
    }
}
