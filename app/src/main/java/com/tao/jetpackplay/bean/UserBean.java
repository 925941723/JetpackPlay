package com.tao.jetpackplay.bean;

/**
 * 作者：zenghaitao
 * 版本：1.0
 * 创建日期：2019/10/30
 * 描述：
 * 修订历史：
 */
public class UserBean {

    private String account;
    private String password;

    public UserBean(String account ,String password){
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
