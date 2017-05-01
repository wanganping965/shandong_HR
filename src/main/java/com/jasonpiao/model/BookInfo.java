package com.jasonpiao.model;

/**
 * Created by jason on 2016/12/21.
 */
public class BookInfo {
    private String bookname;
    private String author;
    private int num;
    private String bookcomment;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getBookcomment() {
        return bookcomment;
    }

    public void setBookcomment(String bookcomment) {
        this.bookcomment = bookcomment;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", num=" + num +
                ", bookcomment='" + bookcomment + '\'' +
                '}';
    }
    public void setAll(String bookname,String author,int num,String bookcomment){
        setBookname(bookname);
        setAuthor(author);
        setNum(num);
        setBookcomment(bookcomment);
    }

}
