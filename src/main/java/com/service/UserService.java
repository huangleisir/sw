package com.service;

import com.dao.UserDao;
import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by XuSong on 2017/11/21.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserLogService userLogService;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void add(){
        //add2();
        userLogService.add();
        int i  = 1/0;
        userDao.add(new User("zhangsan",23));
        System.out.println("插入数据1库成功!");
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void add2(){
        userDao.add(new User("lisi",24));
        System.out.println("插入数据2库成功!");
    }
}
