package com.llm.entity;

import com.mysql.fabric.xmlrpc.base.Data;

import java.io.Serializable;

/**
 * Created by liuliming on 15/12/9.
 */
public class User implements Serializable{
    private int    id;            //用户ID
    private String username;      //用户名
    private String password;      //用户密码
    private String email;         //用户邮箱
    private String createor;      //创建者
    private String modifior;      //改动者
    private Data   createtime;    //创建时间
    private Data   modifiytime;   //改动时间
    private char   status;        //状态


    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateor() {
        return createor;
    }

    public void setCreateor(String createor) {
        this.createor = createor;
    }

    public String getModifior() {
        return modifior;
    }

    public void setModifior(String modifior) {
        this.modifior = modifior;
    }

    public Data getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Data createtime) {
        this.createtime = createtime;
    }

    public Data getModifiytime() {
        return modifiytime;
    }

    public void setModifiytime(Data modifiytime) {
        this.modifiytime = modifiytime;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
