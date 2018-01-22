package com.company;

public class Pasajero {

    private String nombre;
    private int telefono1;

    private Embarque embarque;

    public Pasajero() {
        nombre = "Pipo";
        telefono1 = 111111;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                ", telefono1=" + telefono1 +
                ", embarque=" + embarque +
                '}';
    }
}
