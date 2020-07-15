package com.example.geopuntos;

public class GeoPunto {

    //declaracion de los atributos
    private double longitud, latitud;

    //declaracion de el contructor
    public GeoPunto (double longitud, double latitud){
        this.longitud = longitud;
        this.latitud = latitud;
    }

    //declaracon del metodo toString
    public String toString(){
    return latitud + "," + longitud;
    }

    public double distancia(GeoPunto punto){
        final double RADIO_TIERRA = 6371000; // en metros
        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a =    Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.sin(dLon/2) * Math.sin(dLon/2) *
                        Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c * RADIO_TIERRA;
    }
}