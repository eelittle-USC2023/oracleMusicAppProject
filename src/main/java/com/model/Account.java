package com.model;

public class Account 
{
    private String username;
    private String password;
    private String role;

    public Account(String username, String password, String role)
    {
        this.username = username;
    }
    public boolean checkLogin(String username, String password)
    {
        return true;
    }
}
