package com.jasonpiao.service;

import com.jasonpiao.model.Userlog;

/**
 * Created by jason on 2016/12/21.
 */
public interface UserService {
    boolean checkThisUser(Userlog userlog);
    boolean checkWhetherCanEnroll(Userlog userlog);
    boolean saveThisUser(Userlog userlog);
    boolean checkAdmin(Userlog userlog);
}
