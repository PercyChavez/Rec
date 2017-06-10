package com.example.perco1.listadoconreclycler;

/**
 * Created by PERCO1 on 09/06/2017.
 */

public class Datos {
    private int foto;
    private String nombre;
    private String direccion;

    public Datos(int foto, String nombre, String direccion) {
        this.foto = foto;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
