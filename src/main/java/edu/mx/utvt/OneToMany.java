package edu.mx.utvt;

import edu.mx.utvt.entities.Alumno;
import edu.mx.utvt.entities.Publicaciones;
import edu.mx.utvt.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class OneToMany {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Test
    public void addPost(){
        Alumno alumno = null;
        Publicaciones publicaciones1= null;
        List<Publicaciones> publicaciones = null;

        alumno = (Alumno) this.usuarioRepository.findById(2L).orElse(null);

        publicaciones1 = new Publicaciones("Primera Publicacion", "Esta en mi primer publicacion", "Esta es la primer publicacion usando la relacion de one to many", true, alumno);

        publicaciones = new ArrayList<Publicaciones>();
        publicaciones.add(publicaciones1);

        alumno.setPublicaciones(publicaciones);

        this.usuarioRepository.save(alumno);
    }

    @Test
    public void findPostByUser(){
        Alumno alumno = null;
        alumno = (Alumno) this.usuarioRepository.findById(2L).orElse(null);

        if(alumno != null) {
            alumno.getPublicaciones().forEach(e -> System.out.println(e));
        }
    }
}
