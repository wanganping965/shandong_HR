package com.jasonpiao.dao.daoop;


import com.jasonpiao.dao.daointerface.UserlogBookInfoOp;
import com.jasonpiao.db.ConnectDB;

import com.jasonpiao.model.UserlogBookInfo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Created by jason on 2016/12/21.
 */
@Component("userlogBookInfoOpImpl")
public class UserlogBookInfoOpImpl {
    private SqlSession sqlSession=null;
    private ConnectDB connect;
    @Autowired
    private void setDbAccess(@Qualifier("connectDB") ConnectDB connectDB) {
        connect = connectDB;
    }
    private UserlogBookInfoOp userlogBookInfoOp=null;
    private void setSession()
    {
        try {
            sqlSession=connect.getSqlSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        userlogBookInfoOp=sqlSession.getMapper(UserlogBookInfoOp.class);
    }

    public List<UserlogBookInfo> messageList()
    {
        if(sqlSession==null)
        {
            setSession();
        }

        List<UserlogBookInfo>userlogBookInfoList=null;
        userlogBookInfoList= userlogBookInfoOp.queryUserlogBookInfo();
        return userlogBookInfoList;
    }

    public void insertUserlogBookInfo(UserlogBookInfo userlogBookInfo)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        userlogBookInfoOp.insertUserlogBookInfo(userlogBookInfo);
        sqlSession.commit();
    }


    public List<UserlogBookInfo> selectUserlogBookInfoById(String id) {
        if(sqlSession==null)
        {
            setSession();
        }
        List<UserlogBookInfo> userlogBookInfoList=userlogBookInfoOp.queryOneUserlogBookInfo(id);

        return userlogBookInfoList;
    }
    public void updateUserlogBookInfo(UserlogBookInfo userlogBookInfo)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        userlogBookInfoOp.updateUserlogBookInfo(userlogBookInfo);
        sqlSession.commit();
    }
    public void deleteUserlogBookInfo(UserlogBookInfo userlogBookInfo)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        userlogBookInfoOp.deleteUserlogBookInfo(userlogBookInfo);
        sqlSession.commit();
    }

}
