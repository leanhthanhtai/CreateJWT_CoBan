package com.example.levanTai.service;

import com.example.levanTai.entity.User;
import com.example.levanTai.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public Boolean saveAndFlush(User user) {
        if(user !=null)
        {
            userRepository.saveAndFlush(user);
            return  true;
        }
        return false;
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }
}
