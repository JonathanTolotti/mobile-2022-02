package com.example.mobile_2022_02.Model;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String userPhone;
    private String password;

    private static List<User> users;

    public User(int id, String name, String userPhone, String password) {
        this.id = id;
        this.name = name;
        this.userPhone = userPhone;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
