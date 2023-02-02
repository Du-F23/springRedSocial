package com.duarte.UTVTApiRedSocial.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.io.Serial;
import java.util.Date;

@Entity
@DiscriminatorValue(value = "1")
public class Alumno extends Usuario{
    @Serial
    private static final long serialVersionUID=-1156945731802631833L;

    public Alumno(String nombre, String apellido, Date fn, String correo, String contrasena, Boolean estado) {
        super(nombre, apellido, fn, correo, contrasena, estado);
    }

}
