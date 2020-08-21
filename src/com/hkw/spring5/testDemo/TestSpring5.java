package com.hkw.spring5.testDemo;

import com.hkw.spring5.User;
import com.hkw.spring5.bean.Employee;
import com.hkw.spring5.beanScope.Book;
import com.hkw.spring5.collectionType.Course;
import com.hkw.spring5.collectionType.Student;
import com.hkw.spring5.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @ClassName : testSpring5
 * @Description : Spring5测试类
 * @Author : hkw
 * @Date: 2020-08-19 09:38
 */
public class TestSpring5 {
    @Test
    public void test1() {
        // 1.加载Spring的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
//        BeanFactory applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\spring5_demo\\src\\bean1.xml");

        // 2.获取配置中创建的对象
        User user = applicationContext.getBean("user", User.class);

        // 3.输出查看结果
        System.out.println("name = " + user.getName() + " , age = " + user.getAge());
    }

    @Test
    public void test2() {
        // 1.加载Spring的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        // 2.获取配置中创建的对象
        UserService userService = applicationContext.getBean("userService", UserService.class);

        // 3.调用方法
        userService.add();
    }

    @Test
    public void test3() {
        // 1.加载Spring的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        // 2.获取配置中创建的对象
        Employee employee = applicationContext.getBean("employee", Employee.class);

        // 3.输出查看结果
        System.out.println(employee.toString());
    }

    @Test
    public void test4() {
        // 1.加载Spring的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        // 2.获取配置中创建的对象
        Student student = applicationContext.getBean("student", Student.class);

        // 3.输出查看结果
        System.out.println(student.toString());
    }

    @Test
    public void test5() {
        // 1.加载Spring的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        // 2.获取配置中创建的对象
        Student student = applicationContext.getBean("student", Student.class);

        // 3.输出查看结果
        System.out.println(student.getCourseList());
    }

    @Test
    public void test6() {
        // 1.加载Spring的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");

        // 2.获取配置中创建的对象
        Student student = applicationContext.getBean("student", Student.class);

        // 3.输出查看结果
        System.out.println(student.getList());
    }

    @Test
    public void test7() {
        // 1.加载Spring的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");

        // 2.获取配置中创建的对象
        Course course = applicationContext.getBean("factoryBean", Course.class);

        // 3.输出查看结果
        System.out.println(course.toString());
    }

    @Test
    public void test8() {
        // 1.加载Spring的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean4.xml");

        // 2.获取配置中创建的对象
        Book book1 = applicationContext.getBean("book", Book.class);
        Book book2 = applicationContext.getBean("book", Book.class);

        // 3.输出查看结果
        System.out.println(book1);
        System.out.println(book2);
    }
}
