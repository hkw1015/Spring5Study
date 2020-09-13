package com.hkw.spring5.dao;

import com.hkw.spring5.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName : UserDaoImpl
 * @Description : UserDao实现类
 * @Author : hkw
 * @Date: 2020-08-20 10:01
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insertUser(Object... args) {
        String sql = "insert into t_user(username,password,email) values(?,?,?)";
        int update = jdbcTemplate.update(sql, args);
        return update;
    }

    @Override
    public int updateUser(Object... args) {
        String sql = "update t_user set username = ?,password = ?,email = ? where id = ?";
        int update = jdbcTemplate.update(sql, args);
        return update;
    }

    @Override
    public int deleteUserById(Integer id) {
        String sql = "delete from t_user where id = ?";
        int update = jdbcTemplate.update(sql, id);
        return update;
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_user";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public User selectUserById(Integer id) {
        String sql = "select * from t_user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class),id);
        return user;
    }

    @Override
    public List<User> selectAllUserList() {
        String sql = "select * from t_user";
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        return userList;
    }

    @Override
    public int[] batchInsertUser(List<Object[]> batchArgs) {
        String sql = "insert into t_user(username,password,email) values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        return ints;
    }

    @Override
    public int[] batchUpdateUser(List<Object[]> batchArgs) {
        String sql = "update t_user set username = ?,password = ?,email = ? where id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        return ints;
    }

    @Override
    public int[] batchDeleteUser(List<Object[]> batchArgs) {
        String sql = "delete from t_user where id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        return ints;
    }
}
