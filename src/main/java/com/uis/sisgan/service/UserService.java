package com.uis.sisgan.service;

import com.uis.sisgan.persistence.UserRepository;
import com.uis.sisgan.persistence.entity.User;

import java.util.Optional;

public class UserService {

    private UserRepository userRepository;


    public Optional<User> loadUserByUserName(String email, String password){
        return userRepository.findByEmailAndPassword(email, password);
    }






}
