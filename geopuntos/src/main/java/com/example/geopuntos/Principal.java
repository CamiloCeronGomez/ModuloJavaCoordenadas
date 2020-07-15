package com.example.geopuntos;

public class Principal {
    public static void main(String[] main){
        GeoPunto z, w;
        z = new GeoPunto(-1.5, 3.0);
        w = new GeoPunto(-1.4, 3.0);

        System.out.println("Cordenadas Iniciales: " + z + " Coordenadas Finales : " + w + " Distancia: " + z.distancia(w));
    }
}
