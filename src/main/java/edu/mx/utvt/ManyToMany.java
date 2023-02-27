package edu.mx.utvt;

import edu.mx.utvt.entities.Alumno;
import edu.mx.utvt.entities.Categories;
import edu.mx.utvt.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ManyToMany {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Test
    public void addCategories(){
        Alumno alumno = null;
        Categories categories1 = null;
        Categories categories2 = null;
        List<Categories> categories = null;

        alumno = (Alumno) this.usuarioRepository.findById(2L).orElse(null);

        categories1 = new Categories("Deportes", "Eventos Deportivos");
        categories2 = new Categories("Fiestas", "Eventos de Fin de Semana");

        categories = new ArrayList<Categories>();
        categories.add(categories1);
        categories.add(categories2);

        assert alumno != null;
        alumno.setCategorias(categories);

        this.usuarioRepository.save(alumno);

    }
}
