package com.jasonpiao.dao.daoop;

/**
 * Created by jason on 2016/12/20.
 */

import com.jasonpiao.dao.daointerface.UserlogOp;
import com.jasonpiao.db.ConnectDB;
import com.jasonpiao.model.Userlog;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component("userlogOpImpl")
public class UserlogOpImpl {

   private SqlSession sqlSession=null;
    private ConnectDB connect;
    @Autowired
    private void setDbAccess(@Qualifier("connectDB") ConnectDB connectDB) {
        connect = connectDB;
    }
    private UserlogOp userlogOp=null;
    private void setSession()
    {
        try {
            sqlSession=connect.getSqlSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        userlogOp=sqlSession.getMapper(UserlogOp.class);
    }

    public List<Userlog> messageList()
    {
       if(sqlSession==null)
       {
           setSession();
       }
      
        List<Userlog> userlist=null;
//        userlist=sqlSession.selectList("User.queryUserlog");
        userlist=userlogOp.queryUser();
        return userlist;
    }

    public void insertUserLog(Userlog userlog)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        userlogOp.insertUser(userlog);
        sqlSession.commit();
    }


    public Userlog selectUserById(String id) {
        if(sqlSession==null)
        {
            setSession();
        }

        Userlog userlog=userlogOp.queryOneUser(id);

        return userlog;
    }
    public void updateUserInfo(Userlog userlog)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        userlogOp.updateUser(userlog);
        sqlSession.commit();
    }
    public void deleteUserInfoById(String id)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        userlogOp.deleteUser(id);
        sqlSession.commit();
    }


}
