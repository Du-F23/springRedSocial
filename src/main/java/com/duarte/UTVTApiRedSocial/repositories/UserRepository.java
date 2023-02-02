package com.duarte.UTVTApiRedSocial.repositories;

import com.duarte.UTVTApiRedSocial.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //crea el metodo para buscar por nombre de usuario
    User findByUsername(String username);
}
