package edu.mx.utvt.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue(value = "2")
public class Administrativo extends Usuario{
    @Column(name = "salario", nullable = true)
    private Double salario;

    public Administrativo() {
        // TODO Auto-generated constructor stub
        super();
    }

    public Administrativo(String nombre, String apellido, Date fn, String correo, String contrasena, Boolean estado, Double salario) {
        super(nombre, apellido, fn, correo, contrasena, estado);
        this.salario = salario;
    }

    public Administrativo(Long id, String nombre, String apellido, Date fn, String correo, String contrasena, Boolean estado, Double salario) {
        super(id, nombre, apellido, fn, correo, contrasena, estado);
    }
}
