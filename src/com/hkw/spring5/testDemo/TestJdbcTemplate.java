package com.hkw.spring5.testDemo;

import com.hkw.spring5.bean.User;
import com.hkw.spring5.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestJdbcTemplate {

    @Test
    public void testRegistUser() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean10.xml");
        UserServiceImpl userServiceImpl = ioc.getBean("userServiceImpl", UserServiceImpl.class);
        User user = new User();
        user.setUsername("john");
        user.setPassword("111222");
        user.setEmail("john@123.com");
        System.out.println(userServiceImpl.registUser(user));
    }

    @Test
    public void testUpdateUser() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean10.xml");
        UserServiceImpl userServiceImpl = ioc.getBean("userServiceImpl", UserServiceImpl.class);
        User user = new User();
        user.setId(21);
        user.setUsername("john1");
        user.setPassword("222333");
        user.setEmail("john1@321.com");
        System.out.println(userServiceImpl.updateUser(user));
    }

    @Test
    public void testDeleteUser() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean10.xml");
        UserServiceImpl userServiceImpl = ioc.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(userServiceImpl.deleteUser(21));
    }

    @Test
    public void testGetTotalNumberOfUsers() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean10.xml");
        UserServiceImpl userServiceImpl = ioc.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(userServiceImpl.getTotalNumberOfUsers());
    }

    @Test
    public void testGetUser() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean10.xml");
        UserServiceImpl userServiceImpl = ioc.getBean("userServiceImpl", UserServiceImpl.class);
        User user = userServiceImpl.getUser(19);
        System.out.println(user);
    }

    @Test
    public void testGetAllUserList() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean10.xml");
        UserServiceImpl userServiceImpl = ioc.getBean("userServiceImpl", UserServiceImpl.class);
        List<User> userList = userServiceImpl.getAllUserList();
        userList.forEach(System.out::println);
    }

    @Test
    public void testBatchAddUser() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean10.xml");
        UserServiceImpl userServiceImpl = ioc.getBean("userServiceImpl", UserServiceImpl.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"test1","111111","test1@168.com"};
        Object[] o2 = {"test2","222222","test2@168.com"};
        Object[] o3 = {"test3","333333","test3@168.com"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        System.out.println(userServiceImpl.batchAddUser(batchArgs));
    }

    @Test
    public void testBatchUpdateUser() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean10.xml");
        UserServiceImpl userServiceImpl = ioc.getBean("userServiceImpl", UserServiceImpl.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"test11","1111","test11@168.com",22};
        Object[] o2 = {"test22","222","test22@168.com",23};
        Object[] o3 = {"test33","33333","test33@168.com",24};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        System.out.println(userServiceImpl.batchUpdateUser(batchArgs));
    }

    @Test
    public void testBatchDeleteUser() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean10.xml");
        UserServiceImpl userServiceImpl = ioc.getBean("userServiceImpl", UserServiceImpl.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {22};
        Object[] o2 = {23};
        Object[] o3 = {24};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        System.out.println(userServiceImpl.batchDeleteUser(batchArgs));
    }
}
