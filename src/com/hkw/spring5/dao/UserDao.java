package com.hkw.spring5.dao;

import com.hkw.spring5.bean.User;

import java.util.List;

public interface UserDao {
    int insertUser(Object ... args);

    int updateUser(Object ... args);

    int deleteUserById(Integer id);

    int selectCount();

    User selectUserById(Integer id);

    List<User> selectAllUserList();

    int[] batchInsertUser(List<Object[]> batchArgs);

    int[] batchUpdateUser(List<Object[]> batchArgs);

    int[] batchDeleteUser(List<Object[]> batchArgs);
}
