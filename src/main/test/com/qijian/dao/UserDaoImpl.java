package com.qijian.dao;

import forms.LoginForm;
import forms.RegisterFrom;
import infodao.UserDao4MySqlImpl;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

public class UserDaoImpl {

    @Test
    public void testCon() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        LoginForm loginForm = new LoginForm();
        Class aclass = Class.forName("forms.LoginForm");

        LoginForm loginForm = (LoginForm)aclass.newInstance();
        loginForm.setShenfen(1);
        loginForm.setPassword("root");
        loginForm.setUsername("qijian");
        UserDao4MySqlImpl userDao4MySql = new UserDao4MySqlImpl();
        boolean b = userDao4MySql.con(loginForm.getUsername(),loginForm.getPassword(),loginForm.getShenfen());
        System.out.println(b);

    }
    @Test
    public void testregisterByName() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Constructor constructor = Class.forName("forms.RegisterFrom").getConstructor(String.class,String.class,String.class,String.class);

        RegisterFrom registerFrom = (RegisterFrom) constructor.newInstance("QiJian1","root","男","1831531846@qq.com");

        UserDao4MySqlImpl userDao4MySql = new UserDao4MySqlImpl();
        boolean b = userDao4MySql.registerByName(registerFrom);

        System.out.println(b);
    }

    @Test
    public void testGetAllUser(){
        UserDao4MySqlImpl userDao4MySql = new UserDao4MySqlImpl();
        List list = userDao4MySql.getAllUser();

        Iterator iterable = list.iterator();

        while (iterable.hasNext()){
            System.out.println(iterable.next().toString());
        }


    }

    @Test
    public void testDelUserById(){
        UserDao4MySqlImpl userDao4MySql = new UserDao4MySqlImpl();
        System.out.println(userDao4MySql.delUserById("6"));
    }




}
