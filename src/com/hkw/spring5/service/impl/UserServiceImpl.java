package com.hkw.spring5.service.impl;

import com.hkw.spring5.bean.User;
import com.hkw.spring5.dao.UserDao;
import com.hkw.spring5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean registUser(User user) {
        int i = userDao.insertUser(user.getUsername(), user.getPassword(), user.getEmail());
        boolean flag = (i == 1) ? true : false;
        return flag;
    }

    @Transactional
    @Override
    public boolean updateUser(User user) {
        int i = userDao.updateUser(user.getUsername(), user.getPassword(), user.getEmail(), user.getId());
        boolean flag = (i == 1) ? true : false;
        return flag;
    }

    @Override
    public boolean deleteUser(Integer id) {
        int i = userDao.deleteUserById(id);
        boolean flag = (i == 1) ? true : false;
        return flag;
    }

    @Override
    public int getTotalNumberOfUsers() {
        int count = userDao.selectCount();
        return count;
    }

    @Override
    public User getUser(Integer id) {
        User user = userDao.selectUserById(id);
        return user;
    }

    @Override
    public List<User> getAllUserList() {
        List<User> userList = userDao.selectAllUserList();
        return userList;
    }

    @Override
    public boolean batchAddUser(List<Object[]> batchArgs) {
        int[] ints = userDao.batchInsertUser(batchArgs);
        boolean flag = (ints.length > 0) ? true : false;
        System.out.println("ints: " + ints);
        return flag;
    }

    @Override
    public boolean batchUpdateUser(List<Object[]> batchArgs) {
        int[] ints = userDao.batchUpdateUser(batchArgs);
        boolean flag = (ints.length > 0) ? true : false;
        System.out.println("ints: " + ints);
        return flag;
    }

    @Override
    public boolean batchDeleteUser(List<Object[]> batchArgs) {
        int[] ints = userDao.batchDeleteUser(batchArgs);
        boolean flag = (ints.length > 0) ? true : false;
        System.out.println("ints: " + ints);
        return flag;
    }
}
