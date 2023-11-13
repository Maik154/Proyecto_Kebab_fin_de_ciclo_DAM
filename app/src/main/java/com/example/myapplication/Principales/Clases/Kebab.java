package com.example.myapplication.Principales.Clases;

public class Kebab extends Producto{
    private String contenido;

    public Kebab(int cantidad, double precioUnidad, String contenido) {
        super(cantidad, precioUnidad);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
