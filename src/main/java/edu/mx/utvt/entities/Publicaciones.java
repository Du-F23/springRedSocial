package edu.mx.utvt.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "post")
public class Publicaciones implements Serializable {
    private static final long serialVersionUID = -992378481586392219L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "summary", nullable = false)
    private String summary;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "estado")
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    public Publicaciones(String nombre, String summary, String description, Boolean estado, Usuario usuario){
        super();
        this.nombre = nombre;
        this.summary = summary;
        this.description = description;
        this.estado = estado;
        this.usuario = usuario;
    }

    public Publicaciones() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Publicaciones{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", estado=" + estado +
                ", usuario=" + usuario +
                '}';
    }
}
