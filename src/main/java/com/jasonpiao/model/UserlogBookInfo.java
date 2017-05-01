package com.jasonpiao.model;
import java.sql.Date;

/**
 * Created by jason on 2016/12/21.
 */
public class UserlogBookInfo {
    private String id;
    private String bookname;
    private Date borrowdate;
    private Date returndate;
    private int hasbeenrenewed;
    private Date actualreturndate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Date getBorrowdate() {
        return borrowdate;
    }

    public void setBorrowdate(Date borrowdate) {
        this.borrowdate = borrowdate;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    public int getHasbeenrenewed() {
        return hasbeenrenewed;
    }

    public void setHasbeenrenewed(int hasbeenrenewed) {
        this.hasbeenrenewed = hasbeenrenewed;
    }

    public Date getActualreturndate() {
        return actualreturndate;
    }

    public void setActualreturndate(Date actualreturndate) {
        this.actualreturndate = actualreturndate;
    }
    public void setAll(String id,String bookname,Date borrowdate,Date returndate,int hasbeenrenewed,Date actualreturndate)
    {
        setId(id);
        setBookname(bookname);
        setBorrowdate(borrowdate);
        setReturndate(returndate);
        setHasbeenrenewed(hasbeenrenewed);
        setActualreturndate(actualreturndate);
    }

    @Override
    public String toString() {
        return "UserlogBookInfo{" +
                "id='" + id + '\'' +
                ", bookname='" + bookname + '\'' +
                ", borrowdate=" + borrowdate +
                ", returndate=" + returndate +
                ", hasbeenrenewed=" + hasbeenrenewed +
                ", actualreturndate=" +  actualreturndate +
                '}';
    }
}
