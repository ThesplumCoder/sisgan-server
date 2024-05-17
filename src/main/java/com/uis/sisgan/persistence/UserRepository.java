package com.uis.sisgan.persistence;

import com.uis.sisgan.persistence.crud.UserCrudRepository;
import com.uis.sisgan.persistence.entity.User;

import java.util.Optional;

public class UserRepository {

    UserCrudRepository userCrudRepository;

    public Optional<User> findByEmailAndPassword(String email, String password){
        return  userCrudRepository.findByEmailAndPassword(email,password);
    }

}
