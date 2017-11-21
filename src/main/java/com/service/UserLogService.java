package com.service;

import com.dao.UserLogDao;
import com.domain.UserLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by XuSong on 2017/11/21.
 */
@Service
public class UserLogService {
    @Autowired
    private UserLogDao userLogDao;
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void add(){
        userLogDao.add(new UserLog(1));
    }

}
