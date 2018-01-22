package com.company;

public class Vuelo {

    private String aerolinea;
    private int codigo;
    private String origen;
    private String destino;
    private String fecha;
    private String hora;

    private Embarque embarque;

    public Vuelo() {
        aerolinea = "AAAA";
        codigo = 0001;
        origen = "Penepolis";
        destino = "Pipolandia";
        fecha = "22 de Enero de 2018";
        hora = "00:00";


    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "aerolinea='" + aerolinea + '\'' +
                ", codigo=" + codigo +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", embarque=" + embarque +
                '}';
    }
}
