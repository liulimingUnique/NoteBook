package com.llm.server;

import com.llm.entity.User;

import javax.json.Json;

/**
 * Created by liuliming on 15/12/9.
 */
public interface UserService {

    /**
     * 用户登录
     * @param email
     * @param username
     * @param password
     * @return
     */
    public User loginUser(String email, String username, String password);

    /**
     * 找回密码
     * @param username
     * @param email
     * @return
     */
    public String findPassword(String username, String email);

    /**
     * 用户注册
     * @param user
     * @return
     */
    public Boolean insertUser(User user);
}
