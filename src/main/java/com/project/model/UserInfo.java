package com.project.model;

/**
 * Created by 未来人类 on 2017/5/7.
 */
public class UserInfo {
    private String userName;
    private String roleName;
    private String passworsd;

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

    public String getPassworsd() {
        return passworsd;
    }

    public void setPassworsd(String passworsd) {
        this.passworsd = passworsd;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", passworsd='" + passworsd + '\'' +
                '}';
    }

    public void setAll(String userName, String roleName, String passworsd)
    {
        setUserName(userName);
        setRoleName(roleName);
        setPassworsd((passworsd));
    }

}
