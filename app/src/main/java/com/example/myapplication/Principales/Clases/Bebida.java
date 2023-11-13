package com.example.myapplication.Principales.Clases;

public class Bebida extends Producto{
    private String tipo;

    public Bebida(int cantidad, double precioUnidad, String tipo) {
        super(cantidad, precioUnidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
