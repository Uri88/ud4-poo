package com.company;

public class Embarque {

    private int numeroMaleta;
    private String numAsiento;
    private char clase;
    private String puertaEmbarque;
    private String billete;

    private Pasajero pasajero;
    private Vuelo vuelo;

    public Embarque() {

        numeroMaleta = 01;
        numAsiento = "A001";
        clase = 'C';
        puertaEmbarque = "A01";
        billete = "001A";

        pasajero = new Pasajero();
        vuelo = new Vuelo();
    }

    @Override
    public String toString() {
        return "Embarque{" +
                "numeroMaleta=" + numeroMaleta +
                ", numAsiento='" + numAsiento + '\'' +
                ", clase=" + clase +
                ", puertaEmbarque='" + puertaEmbarque + '\'' +
                ", billete='" + billete + '\'' +
                ", pasajero=" + pasajero +
                ", vuelo=" + vuelo +
                '}';
    }
}
