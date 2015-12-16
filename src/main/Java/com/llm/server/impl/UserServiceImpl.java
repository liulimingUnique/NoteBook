package com.llm.server.impl;

import com.llm.dao.UserDao;
import com.llm.entity.User;
import com.llm.server.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liuliming on 15/12/16.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name ="userDao" )
    private UserDao userDao;
    public User loginUser(String email, String username, String password) {
        return this.loginUser(email,username,password);
    }

    public String findPassword(String username, String email) {

        return this.findPassword(username,email);
    }

    public Boolean insertUser(User user) {

        return this.insertUser(user);
    }
}
