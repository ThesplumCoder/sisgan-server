package com.uis.sisgan.persistence.crud;

import com.uis.sisgan.persistence.entity.User;
import org.mapstruct.control.MappingControl;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<User,Integer> {

    Optional<User> findByEmailAndPassword(String email, String password);

}
