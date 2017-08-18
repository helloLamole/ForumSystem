package com.lingo.forum.model;

/**
 * Created by admin on 2017/8/13.
 */
public class User {

    private int id;// 图书ID

    private String name;// 图书名称

    private String password;// 馆藏数量

    public User(){

    }
    @Override
    public String toString(){
        return "My Name is "+name;
    }
}
