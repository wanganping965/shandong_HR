package com.jasonpiao.service.impl;

import com.jasonpiao.dao.daoop.UserlogOpImpl;
import com.jasonpiao.model.Userlog;
import com.jasonpiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by jason on 2016/12/21.
 */
@Service("userServiceImpl")

public class UserServiceImpl implements UserService {
    private UserlogOpImpl userlogOpimpl;
    @Autowired
    public void setUserlogOpimpl(@Qualifier("userlogOpImpl") UserlogOpImpl userlogOpimpl) {
        this.userlogOpimpl = userlogOpimpl;
    }
    @Override
    public boolean checkThisUser(Userlog userlog) {
        Userlog userInDB=userlogOpimpl.selectUserById(userlog.getId());
        if(userInDB==null)
        {
            return false;
        }
        if(userInDB.getPswd().equals(userlog.getPswd()))
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean checkWhetherCanEnroll(Userlog userlog) {
        if(userlogOpimpl.selectUserById(userlog.getId())==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean saveThisUser(Userlog userlog) {
        userlogOpimpl.insertUserLog(userlog);
        return true;
    }

    @Override
    public boolean checkAdmin(Userlog userlog) {
        if(!userlog.getId().equals("root"))
        {
            return false;
        }
        if(!userlog.getPswd().equals("root"))
        {
            return false;
        }
        Userlog u=userlogOpimpl.selectUserById(userlog.getId());
        if(u==null)
        {
            return false;
        }
        if(!u.getPswd().equals("root"))
        {
            return false;
        }
        return true;
    }

}
