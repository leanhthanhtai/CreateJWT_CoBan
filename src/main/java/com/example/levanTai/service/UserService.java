package com.example.levanTai.service;

import com.example.levanTai.entity.User;

import java.util.List;

public interface UserService {

    public Boolean saveAndFlush(User user);
    public List<User> getUser();

}
