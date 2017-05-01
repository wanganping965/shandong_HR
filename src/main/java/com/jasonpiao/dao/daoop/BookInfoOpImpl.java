package com.jasonpiao.dao.daoop;


import com.jasonpiao.dao.daointerface.BookInfoOp;
import com.jasonpiao.db.ConnectDB;

import com.jasonpiao.model.BookInfo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.io.IOException;
import java.util.List;

/**
 * Created by jason on 2016/12/21.
 */
@Component("bookInfoOpImpl")
public class BookInfoOpImpl {
    private SqlSession sqlSession=null;
    private ConnectDB connect;
    @Autowired
    private void setDbAccess(@Qualifier("connectDB") ConnectDB connectDB) {
        connect = connectDB;
    }
    private BookInfoOp bookInfoOp=null;
    private void setSession()
    {
        try {
            sqlSession=connect.getSqlSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        bookInfoOp=sqlSession.getMapper(BookInfoOp.class);
    }

    public List<BookInfo> messageList()
    {
        if(sqlSession==null)
        {
            setSession();
        }

        List<BookInfo>bookInfoList=null;
        bookInfoList=bookInfoOp.queryBook();
        return bookInfoList;
    }

    public void insertBookInfo(BookInfo bookInfo)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        bookInfoOp.insertBook(bookInfo);
        sqlSession.commit();
    }


    public BookInfo selectBookByName(String bookname) {
        if(sqlSession==null)
        {
            setSession();
        }

        BookInfo bookInfo=bookInfoOp.queryOneBook(bookname);

        return bookInfo;
    }
    public void updateBookInfo(BookInfo bookInfo)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        bookInfoOp.updateBook(bookInfo);
        sqlSession.commit();
    }
    public void deleteBookInfoByName(String bookname)
    {
        if(sqlSession==null)
        {
            setSession();
        }
        bookInfoOp.deleteBook(bookname);
        sqlSession.commit();
    }

}
