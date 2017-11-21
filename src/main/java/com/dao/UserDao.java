package com.dao;

import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by XuSong on 2017/11/21.
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void add(User user){
        String sql = "INSERT into `user`(age,name) VALUES (?,?);";
        jdbcTemplate.update(sql,user.getAge(),user.getName());
    }
}
