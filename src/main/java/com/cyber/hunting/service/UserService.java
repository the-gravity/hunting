package com.cyber.hunting.service;

import com.cyber.hunting.entity.User;
import com.cyber.hunting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired(required = false)
    UserRepository userRepository;

    /**
     * 登录
     */
    public User signIn(String name,String password){
        return userRepository.findByNameAndPassword(name, password);
    }
}
