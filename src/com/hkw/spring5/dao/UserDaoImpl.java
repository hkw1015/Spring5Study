package com.hkw.spring5.dao;

/**
 * @ClassName : UserDaoImpl
 * @Description : UserDao实现类
 * @Author : hkw
 * @Date: 2020-08-20 10:01
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("UserDaoImpl add ...");
    }
}
