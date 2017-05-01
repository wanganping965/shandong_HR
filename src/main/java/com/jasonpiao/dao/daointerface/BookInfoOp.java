package com.jasonpiao.dao.daointerface;

import com.jasonpiao.model.BookInfo;
import com.jasonpiao.model.Userlog;

import java.util.List;

/**
 * Created by jason on 2016/12/21.
 */
public interface BookInfoOp {
    List<BookInfo> queryBook();
    BookInfo queryOneBook(String bookname);
    void insertBook(BookInfo bookInfo);
    void deleteBook(String bookname);
    void updateBook(BookInfo bookInfo);
}
