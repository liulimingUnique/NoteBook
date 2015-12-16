package com.llm.dao;

import com.llm.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import javax.json.Json;

/**
 * Created by liuliming on 15/12/9.
 */
@Repository("userDao")
public interface UserDao{
    /**
     * 用户登录
     * @param password
     * @param email
     * @param username
     * @return Json
     */
    public User loginUser(String password, String email, String username);

    /**
     * 用户注册
     * @param user
     * @return
     */
    public Boolean insertUser(User user);

    /**
     * 找回密码
     * @param email
     * @param username
     * @return String
     */
    public String  findpassword(String email, String username);

}
