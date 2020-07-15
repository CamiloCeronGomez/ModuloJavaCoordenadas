package com.example.geopuntos;
/** Clase que reorensenta la longitud y latitud de la tierra */
public class GeoPunto {

    //declaracion de los atributos
    /** Se define los atributos longitud y latitud de tipo doble */
    private double longitud, latitud;

    //declaracion de el contructor
    /** Le asigna los parametos del constructor a los atributos declarados de la clase GeoPunto */
    public GeoPunto (double longitud, double latitud){
        this.longitud = longitud;
        this.latitud = latitud;
    }

    //declaracon del metodo toString
    /** devuelve una cadena de parametros de tipo String concatenando Latitud y longitud */

    public String toString(){
    return latitud + "," + longitud;
    }

    //Declaracion del metoo distancia que
    /** Calcula la ditancia aproximada de dos coordenadas usando el algoritmo Hersain */


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