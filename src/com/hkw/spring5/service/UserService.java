package com.hkw.spring5.service;

import com.hkw.spring5.bean.User;

import java.util.List;

/**
 * @ClassName : UserService
 * @Description :
 * @Author : hkw
 * @Date: 2020-08-20 10:02
 */
public interface UserService {
    // 注册用户
    boolean registUser(User user);

    // 更新用户
    boolean updateUser(User user);

    // 删除用户
    boolean deleteUser(Integer id);

    // 查询用户总数
    int getTotalNumberOfUsers();

    // 查询某个用户
    User getUser(Integer id);

    // 查询所有用户
    List<User> getAllUserList();

    // 批量添加用户
    boolean batchAddUser(List<Object[]> batchArgs);

    // 批量修改用户
    boolean batchUpdateUser(List<Object[]> batchArgs);

    // 批量删除用户
    boolean batchDeleteUser(List<Object[]> batchArgs);
}
