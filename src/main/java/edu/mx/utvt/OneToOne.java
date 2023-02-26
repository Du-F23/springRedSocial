package edu.mx.utvt;

import edu.mx.utvt.entities.Alumno;
import edu.mx.utvt.entities.User;
import edu.mx.utvt.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class OneToOne {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Test
    public void addOneToOneRelationship(){
        //Primera relacion OneToOne
        User user1 = new User("alex", "123456");
        Alumno alumno1 = new Alumno("Alex", "Duarte", new Date(), "alexduarte@gmail.com" , "123456", true);
        alumno1.setUser(user1);
        this.usuarioRepository.save(alumno1);

        //Segunda relacion OneToOne
        User user2 = new User("Luis", "Luis123");
        Alumno alumno2 = new Alumno("Luis", "Duarte", new Date(), "luisduarte@gmail.com", "123456", true);
        alumno2.setUser(user2);
        this.usuarioRepository.save(alumno2);
    }

}
