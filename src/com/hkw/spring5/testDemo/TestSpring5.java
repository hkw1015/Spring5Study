package com.hkw.spring5.testDemo;

import com.hkw.spring5.User;
import com.hkw.spring5.bean.Employee;
import com.hkw.spring5.bean.Order;
import com.hkw.spring5.beanScope.Book;
import com.hkw.spring5.collectionType.Course;
import com.hkw.spring5.proxy.Student;
import com.hkw.spring5.config.SpringConfig;
import com.hkw.spring5.service.OrderService;
import com.hkw.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

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
//        userService.add();
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

//    @Test
//    public void test5() {
//        // 1.加载Spring的配置文件
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
//
//        // 2.获取配置中创建的对象
//        Student student = applicationContext.getBean("student", Student.class);
//
//        // 3.输出查看结果
//        System.out.println(student.getCourseList());
//    }
//
//    @Test
//    public void test6() {
//        // 1.加载Spring的配置文件
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
//
//        // 2.获取配置中创建的对象
//        Student student = applicationContext.getBean("student", Student.class);
//
//        // 3.输出查看结果
//        System.out.println(student.getList());
//    }

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

    @Test
    public void test9() {
        // 1.加载Spring的配置文件
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean5.xml");

        // 2.获取配置中创建的对象
        Order order = applicationContext.getBean("order", Order.class);
        System.out.println("第四步，获取创建的Bean实例对象");

        // 3.输出查看结果
        System.out.println(order);

        // 4.手动调用销毁实例的方法
        applicationContext.close();
    }

    @Test
    public void test10() {
        // 1.加载Spring的配置文件
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("bean6.xml");

        // 2.获取配置中创建的对象
        Employee employee = ioc.getBean("employee", Employee.class);

        // 3.输出查看结果
        System.out.println(employee);
    }

    @Test
    public void test11() throws SQLException {
        // 1.加载Spring的配置文件
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("bean7.xml");

        // 2.获取配置中创建的对象
        DataSource dataSource = ioc.getBean("dataSource", DataSource.class);

        // 3.输出查看结果
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void test12() throws SQLException {
        // 1.加载Spring的  配置文件
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("bean8.xml");

        // 2.获取配置中创建的对象
        OrderService orderService = ioc.getBean("orderService", OrderService.class);

        // 3.输出查看结果
        System.out.println(orderService);
        orderService.add();
    }

    @Test
    public void testSpringConfig() throws SQLException {
        // 1.加载配置类
        ApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 2.获取配置中创建的对象
        OrderService orderService = ioc.getBean("orderService", OrderService.class);

        // 3.输出查看结果
        System.out.println(orderService);
        orderService.add();
    }

    @Test
    public void testAOP() {
        // 1.加载配置类
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean9.xml");

        // 2.获取配置中创建的对象
        Student student = ioc.getBean("student", Student.class);

        // 3.输出查看结果
        System.out.println(student);
        student.add();
    }
}
