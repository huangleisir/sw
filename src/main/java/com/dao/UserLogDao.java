package com.dao;

import com.domain.User;
import com.domain.UserLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by XuSong on 2017/11/21.
 */
@Repository
public class UserLogDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void add(UserLog log){
        String sql = "INSERT into `user_log`(id) VALUES (?);";
        jdbcTemplate.update(sql,log.getId());
    }
}
