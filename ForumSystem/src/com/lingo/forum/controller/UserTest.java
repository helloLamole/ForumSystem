package com.lingo.forum.controller;

import com.lingo.forum.dao.UserDao;
import com.lingo.forum.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2017/7/12.
 */
@Controller
public class UserTest {
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    @RequestMapping("test/getUser.do")
    public String getUserByUserNameTest(String userName, HttpServletRequest request){

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.selectUserByName(userName);
        System.out.println(user.toString());
        request.setAttribute("name",user.toString());
        return "index";
    }
}
