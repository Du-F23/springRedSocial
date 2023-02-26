package edu.mx.utvt;

import edu.mx.utvt.entities.User;
import edu.mx.utvt.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void crearUser() {
        String name = "Fernando";
        String pass = "Fernando13";
        //crea el registro en la base de dates
        User user = new User(name, pass);
        this.userRepository.save(user);

        //guarda el registro en la base de datos
        System.out.println("User creado" + " " + user);
    }

    @Test
    public void actualizeUser() {
        User user = this.userRepository.findById(1L).orElse(null);

        if (user != null) {
            user.setUsername("Duarte");
            this.userRepository.saveAndFlush(user);

            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
            System.out.println(user.getId());
        }

        System.out.println(user);
    }
}
