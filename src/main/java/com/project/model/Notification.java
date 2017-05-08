package com.project.model;
import java.sql.Date;

/**
 * Created by 未来人类 on 2017/5/7.
 */
public class Notification {
    private String title;
    private int n_id;
    private String context;
    private Date time;
    private String publisher;
    private String userName;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getN_id() {
        return n_id;
    }

    public void setN_id(int n_id) {
        this.n_id = n_id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "title='" + title + '\'' +
                ", n_id=" + n_id +
                ", context='" + context + '\'' +
                ", time=" + time +
                ", publisher='" + publisher + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public void setAll(String title, int n_id, String context, Date time, String publisher, String userName)
    {
        setTitle(title);
        setN_id(n_id);
        setContext(context);
        setTime( time);
        setPublisher(publisher);
        setUserName( userName);
    }
}
