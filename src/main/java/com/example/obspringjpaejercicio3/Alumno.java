package com.example.obspringjpaejercicio3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String Apellido;
    private String Seccion;

    public Alumno() {
    }

    public Alumno(Long id, String nombre, String apellido, String seccion) {
        this.id = id;
        this.nombre = nombre;
        Apellido = apellido;
        Seccion = seccion;
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

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String seccion) {
        Seccion = seccion;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Seccion='" + Seccion + '\'' +
                '}';
    }
}
