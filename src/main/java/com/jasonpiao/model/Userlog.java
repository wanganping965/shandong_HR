package com.jasonpiao.model;

/**
 * Created by jason on 2016/12/20.
 */
public class Userlog {
    private String id;
    private String pswd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    @Override
    public String toString() {
        return "Userlog{" +
                "id='" + id + '\'' +
                ", pswd='" + pswd + '\'' +
                '}';
    }
}
