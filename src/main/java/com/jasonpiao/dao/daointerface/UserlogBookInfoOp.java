package com.jasonpiao.dao.daointerface;

import com.jasonpiao.model.UserlogBookInfo;

import java.util.List;

/**
 * Created by jason on 2016/12/21.
 */
public interface UserlogBookInfoOp {
    List<UserlogBookInfo> queryUserlogBookInfo();
    List<UserlogBookInfo> queryOneUserlogBookInfo(String id);
    void insertUserlogBookInfo(UserlogBookInfo userlogBookInfo);
    void deleteUserlogBookInfo(UserlogBookInfo userlogBookInf);
    void updateUserlogBookInfo(UserlogBookInfo userlogBookInfo);
}
