package edu.mx.utvt.repository;

import edu.mx.utvt.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}
