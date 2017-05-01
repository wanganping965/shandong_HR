package com.jasonpiao.service;

import com.jasonpiao.model.UserlogBookInfo;

import java.util.List;

/**
 * Created by jason on 2016/12/21.
 */
public interface UserbookService {
    List<UserlogBookInfo> getUserBookById(String id);

    boolean doBorrow(String id,String bookname);
    boolean doReturn(String id,String bookname);
    boolean doRenew(String id,String bookname);
}
