package com.ravi.springbootinmemorydatabase.service;

import com.ravi.springbootinmemorydatabase.model.Users;

import java.util.LinkedList;
import java.util.List;

public class UserServiceImpl  implements UserService{
    @Override
    public List<Users> findByName(String name) {
        Users users = new Users(1,"ravindra","hp");
        List lit = new LinkedList();
        lit.add(users);
        return lit;
    }
}
