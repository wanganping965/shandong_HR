package com.jasonpiao.service;

import com.jasonpiao.model.BookInfo;

import java.util.List;

/**
 * Created by jason on 2016/12/21.
 */
public interface BookService {
    List<BookInfo> getAllBook();
    boolean addABook(BookInfo bookInfo);
    boolean deleteABook(String bookname);
     boolean updateABook(BookInfo bookInfo);
}
