package com.hkw.spring5.service;

import com.hkw.spring5.dao.UserDao;

/**
 * @ClassName : UserService
 * @Description :
 * @Author : hkw
 * @Date: 2020-08-20 10:02
 */
public class UserService {
    // 创建 UserDao 类型属性，生成 set 方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        userDao.add();
    }
}
