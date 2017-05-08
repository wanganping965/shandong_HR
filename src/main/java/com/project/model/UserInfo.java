package com.project.model;

/**
 * Created by 未来人类 on 2017/5/7.
 */
public class UserInfo {
    private String userName;
    private String roleName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", passworsd='" + password + '\'' +
                '}';
    }

    public void setAll(String userName, String roleName, String password)
    {
        setUserName(userName);
        setRoleName(roleName);
        setPassword((password));
    }

}
