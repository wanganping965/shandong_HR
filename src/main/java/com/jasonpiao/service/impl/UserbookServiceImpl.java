package com.jasonpiao.service.impl;

import com.jasonpiao.dao.daointerface.UserlogBookInfoOp;
import com.jasonpiao.dao.daoop.BookInfoOpImpl;
import com.jasonpiao.dao.daoop.UserlogBookInfoOpImpl;
import com.jasonpiao.dao.daoop.UserlogOpImpl;
import com.jasonpiao.model.BookInfo;
import com.jasonpiao.model.UserlogBookInfo;
import com.jasonpiao.service.UserbookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * Created by jason on 2016/12/21.
 */
@Service("userbookServiceImpl")
public class UserbookServiceImpl implements UserbookService {

    private UserlogBookInfoOpImpl userlogBookInfoOpImpl;
    @Autowired
    public void setUserlogBookInfoOpImpl(@Qualifier("userlogBookInfoOpImpl") UserlogBookInfoOpImpl userlogBookInfoOpImpl) {
        this.userlogBookInfoOpImpl = userlogBookInfoOpImpl;
    }
    BookInfoOpImpl bookInfoOpImpl;
    @Autowired
    public void setBookInfoOpImpl(@Qualifier("bookInfoOpImpl") BookInfoOpImpl bookInfoOpImpl) {
        this.bookInfoOpImpl = bookInfoOpImpl;
    }
    private UserlogOpImpl userlogOpimpl;
    @Autowired
    public void setUserlogOpimpl(@Qualifier("userlogOpImpl") UserlogOpImpl userlogOpimpl) {
        this.userlogOpimpl = userlogOpimpl;
    }

    @Override
    public List<UserlogBookInfo> getUserBookById(String id) {
        return userlogBookInfoOpImpl.selectUserlogBookInfoById(id);
    }


    private boolean whetherCanBorrowThisBook(String id,String bookname) {
        List<UserlogBookInfo> userlogBookInfoList=userlogBookInfoOpImpl.messageList();
        for(UserlogBookInfo userlogBookInfo:userlogBookInfoList)
        {
            if(userlogBookInfo.getBookname().equals(bookname)&&userlogBookInfo.getId().equals(id)&&userlogBookInfo.getActualreturndate()==null)
            {
                return false;
            }
        }
        BookInfo bookInfo=bookInfoOpImpl.selectBookByName(bookname);
        if(bookInfo.getNum()==0)
        {
            return false;
        }
        bookInfo.setNum(bookInfo.getNum()-1);
        bookInfoOpImpl.updateBookInfo(bookInfo);

        return true;
    }
    private boolean whetherCanReturnThisBook(String id,String bookname)
    {
        List<UserlogBookInfo> userlogBookInfoList=userlogBookInfoOpImpl.messageList();
        UserlogBookInfo userlogBookInfoH=null;
        for(UserlogBookInfo userlogBookInfo:userlogBookInfoList)
        {
            if(userlogBookInfo.getBookname().equals(bookname)&&userlogBookInfo.getId().equals(id)&&userlogBookInfo.getActualreturndate()==null)
            {
                userlogBookInfoH=userlogBookInfo;
                break;
            }
        }
        if(userlogBookInfoH==null)
        {
            return false;
        }

        BookInfo bookInfo=bookInfoOpImpl.selectBookByName(bookname);
        bookInfo.setNum(bookInfo.getNum()+1);
        bookInfoOpImpl.updateBookInfo(bookInfo);

        Date date=new Date(System.currentTimeMillis());
        userlogBookInfoH.setActualreturndate(date);
        userlogBookInfoOpImpl.updateUserlogBookInfo(userlogBookInfoH);

        return true;
    }


    private Date returnNextDate(Date date)
    {

        System.out.println(date);
        String[] s=date.toString().split("-");
        int year,month,day;
        year=Integer.valueOf(s[0]);
        month=Integer.valueOf(s[1]);
        day=Integer.valueOf(s[2]);
        if(month+1>12)
        {
            year++;
            month=1;
        }
        else
        {
            month++;
        }
        day=28;
        String f="";
        f=String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
        return Date.valueOf(f);
    }

    private void borrowThisBook(String id, String bookname) {
        Date returndate=new Date(System.currentTimeMillis());
        Date borrowdate=new Date(System.currentTimeMillis());
        returndate=returnNextDate(returndate);
        UserlogBookInfo userlogBookInfo=new UserlogBookInfo();
        userlogBookInfo.setAll(id,bookname,borrowdate,returndate,0,null);
        List<UserlogBookInfo> list=userlogBookInfoOpImpl.selectUserlogBookInfoById(userlogBookInfo.getId());
        for(UserlogBookInfo ub:list)
        {
            if(ub.getBookname().equals(userlogBookInfo.getBookname()))
            {
                userlogBookInfoOpImpl.updateUserlogBookInfo(userlogBookInfo);
                return;
            }
        }
        userlogBookInfoOpImpl.insertUserlogBookInfo(userlogBookInfo);
    }
    @Override
    public boolean doBorrow(String id, String bookname)
    {
        if(!whetherCanBorrowThisBook(id,bookname))
        {
            return false;
        }
        borrowThisBook(id,bookname);


        return true;
    }

    @Override
    public boolean doReturn(String id, String bookname)
    {
        if(!whetherCanReturnThisBook(id,bookname))
        {
            return false;
        }
        return true;
    }

    private boolean compareTwoDate(Date date1,Date date2)
    {
        String[] s1=date1.toString().split("-");
        int year1,month1,day1;
        year1=Integer.valueOf(s1[0]);
        month1=Integer.valueOf(s1[1]);
        day1=Integer.valueOf(s1[2]);

        String[] s2=date2.toString().split("-");
        int year2,month2,day2;
        year2=Integer.valueOf(s2[0]);
        month2=Integer.valueOf(s2[1]);
        day2=Integer.valueOf(s2[2]);

        if(year1<year2)
        {
            return false;
        }
        if(year1>year2)
        {
            return true;
        }
        if(year1==year2)
        {
            if(month1<month2)
            {
                return false;
            }
            if(month1>month2)
            {
                return true;
            }
            if(month1==month2)
            {
                return day1>day2;
            }

        }
        return false;
    }

    @Override
    public boolean doRenew(String id, String bookname) {
        List<UserlogBookInfo> list=userlogBookInfoOpImpl.selectUserlogBookInfoById(id);

        for(UserlogBookInfo ub:list)
        {
            if(ub.getBookname().equals(bookname)&&ub.getActualreturndate()==null&&ub.getHasbeenrenewed()<2&&compareTwoDate(ub.getReturndate(),ub.getBorrowdate()))
            {
                ub.setReturndate(returnNextDate(ub.getReturndate()));
                ub.setHasbeenrenewed(ub.getHasbeenrenewed()+1);
                userlogBookInfoOpImpl.updateUserlogBookInfo(ub);
                return true;
            }
        }
        return false;
    }


}
