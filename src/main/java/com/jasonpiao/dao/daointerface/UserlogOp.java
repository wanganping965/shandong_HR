package com.jasonpiao.dao.daointerface;

import com.jasonpiao.model.Userlog;

import java.util.List;

/**
 * Created by jason on 2016/12/21.
 */
public interface UserlogOp {
    List<Userlog> queryUser();
    Userlog queryOneUser(String id);
    void insertUser(Userlog userlog);
    void deleteUser(String id);
    void updateUser(Userlog userlog);
}
