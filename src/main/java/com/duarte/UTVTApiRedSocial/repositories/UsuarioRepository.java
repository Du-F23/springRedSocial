package com.duarte.UTVTApiRedSocial.repositories;

import com.duarte.UTVTApiRedSocial.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
