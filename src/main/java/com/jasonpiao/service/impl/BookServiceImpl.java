package com.jasonpiao.service.impl;

import com.jasonpiao.dao.daoop.BookInfoOpImpl;
import com.jasonpiao.dao.daoop.UserlogBookInfoOpImpl;
import com.jasonpiao.model.BookInfo;
import com.jasonpiao.model.UserlogBookInfo;
import com.jasonpiao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jason on 2016/12/21.
 */
@Service("bookServiceImpl")
public class BookServiceImpl  implements BookService{



    BookInfoOpImpl bookInfoOpImpl;
    @Autowired
    public void setBookInfoOpImpl(@Qualifier("bookInfoOpImpl") BookInfoOpImpl bookInfoOpImpl) {
        this.bookInfoOpImpl = bookInfoOpImpl;
    }
    private UserlogBookInfoOpImpl userlogBookInfoOpImpl;
    @Autowired
    public void setUserlogBookInfoOpImpl(@Qualifier("userlogBookInfoOpImpl") UserlogBookInfoOpImpl userlogBookInfoOpImpl) {
        this.userlogBookInfoOpImpl = userlogBookInfoOpImpl;
    }
    @Override
    public List<BookInfo> getAllBook() {

        List<BookInfo> bookInfoList= bookInfoOpImpl.messageList();
        return bookInfoList;
    }

    @Override
    public boolean addABook(BookInfo bookInfo) {
        if(bookInfoOpImpl.selectBookByName(bookInfo.getBookname())==null)
        {
            bookInfoOpImpl.insertBookInfo(bookInfo);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteABook(String bookname) {
        if(bookInfoOpImpl.selectBookByName(bookname)!=null)
        {
            List<UserlogBookInfo> userlogBookInfoList=userlogBookInfoOpImpl.messageList();

            for(UserlogBookInfo userlogBookInfo:userlogBookInfoList)
            {
                if(userlogBookInfo.getBookname().equals(bookname))
                {
                    userlogBookInfoOpImpl.deleteUserlogBookInfo(userlogBookInfo);
                }
            }
            bookInfoOpImpl.deleteBookInfoByName(bookname);
            return true;
        }
        return false;
    }
    @Override
    public boolean updateABook(BookInfo bookInfo)
    {
        bookInfoOpImpl.updateBookInfo(bookInfo);
        return true;
    }

}
