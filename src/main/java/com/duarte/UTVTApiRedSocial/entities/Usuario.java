package com.duarte.UTVTApiRedSocial.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "te_usuarios")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.INTEGER)
public abstract class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "fn", nullable = false)
    private Date fn;
    @Column(name = "correo", nullable = false, unique = true)
    private String correo;
    @Column(name = "contrasena", nullable = false)
    private String contrasena;
    @Column(name = "estado", nullable = false)
    private Boolean estado;


    public Usuario() {
        // TODO Auto-generated constructor stub
    }

    public Usuario(String nombre, String apellido, Date fn, String correo, String contrasena, Boolean estado) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.fn = fn;
        this.correo = correo;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    public Usuario(Long id, String nombre, String apellido, Date fn, String correo, String contrasena, Boolean estado) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fn = fn;
        this.correo = correo;
        this.contrasena = contrasena;
        this.estado = estado;
    }
}
