package edu.mx.utvt;

import edu.mx.utvt.entities.Alumno;
import edu.mx.utvt.entities.Categories;
import edu.mx.utvt.repository.CategoriesRepository;
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

    @Autowired
    private CategoriesRepository categoriesRepository;

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

        alumno.setCategorias(categories);

        this.usuarioRepository.save(alumno);

    }

    @Test
    public void findUserByCategories(){
        Alumno alumno = null;
        alumno = (Alumno) this.usuarioRepository.findById(2L).orElse(null);

        assert alumno != null;
        alumno.getCategorias().forEach(System.out::println);
    }

    @Test
    public void deleteLinkingUsuarioCategoria(){
        Alumno alumno = null;
        alumno = (Alumno) this.usuarioRepository.findById(2L).orElse(null);
        alumno.setCategorias(null);
        this.usuarioRepository.save(alumno);
    }

    @Test
    public void deleteCategories(){
        Long categoryId = 1L;
        Categories categories = null;

        categories = this.categoriesRepository.findById(categoryId).orElse(null);
        if(categories != null){
            System.out.println("Categorie deleted success");
            this.categoriesRepository.deleteById(categoryId);
        }
    }
}
