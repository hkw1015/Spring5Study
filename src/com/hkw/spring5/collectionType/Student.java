package com.hkw.spring5.collectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName : Student
 * @Description : 学生类
 * @Author : hkw
 * @Date: 2020-08-20 13:03
 */
public class Student {
    // 数组类型属性
    String[] courses;

    // List集合类型属性
    List<String> list;

    public List<String> getList()  {
        return list;
    }

    // Set集合类型属性
    Set<String> set;

    // Map集合类型属性
    Map<String,String> map;

    // List中放对象
    List<Course> courseList;

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
