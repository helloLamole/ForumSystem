package com.lingo.forum.dao;

import com.lingo.forum.model.User;

/**
 * Created by admin on 2017/8/13.
 */
public interface UserDao {
    User selectUserByName(String userName);
}
