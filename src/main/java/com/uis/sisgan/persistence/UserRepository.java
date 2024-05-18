package com.uis.sisgan.persistence;

import com.uis.sisgan.persistence.crud.UserCrudRepository;
import com.uis.sisgan.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository {

    // Repositorio CRUD utilizado para acceder y gestionar entidades de User
    @Autowired
    private UserCrudRepository userCrudRepository;

    /**
     * Encuentra un usuario por su correo electrónico y contraseña.
     *
     * @param email El correo electrónico del usuario a encontrar.
     * @param password La contraseña del usuario a encontrar.
     * @return Optional<User> Un Optional que contiene la entidad de User si se encuentra, o vacío si no se encuentra.
     */
    public Optional<User> findByEmailAndPassword(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
}
