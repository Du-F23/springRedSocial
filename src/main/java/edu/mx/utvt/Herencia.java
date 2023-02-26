package edu.mx.utvt;

import edu.mx.utvt.entities.*;
import edu.mx.utvt.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class Herencia {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Test
    public void addUsuario() {
        Alumno alumno = null;
        alumno = new Alumno("Fernando", "Duarte", new Date(), "fernandoduarte1v@gmail.com", "123456", true);
        this.usuarioRepository.save(alumno);
        //si el proceso es correcto, se debe de ver en la base de datos
        System.out.println("Alumno agregado" + " " + alumno);
    }

    @Test
    public void addAdministrativo() {
        Administrativo administrativo = null;
        administrativo = new Administrativo("Fernando", "Duarte", new Date(), "ferduate@gmail.com", "123456", true, 10000.0);
        this.usuarioRepository.save(administrativo);
        //si el proceso es correcto, se debe de ver en la base de datos
        System.out.println("Administrativo agregado" + " " + administrativo);
    }
}
