package com.example.myapplication.Principales.Clases;

public abstract class Producto {

    private int cantidad;
    private double precioUnidad;
    public Producto(int cantidad, double precioUnidad) {

        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
}
