package com.juancarlosmaya.soluciones;
/*Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.*/

import com.juancarlosmaya.principal.ObtenerDatoHelper;

public class Solucion12 {
    public boolean compararPalabras(String a, String b)
    {
        return a.equals(b);
    }

    public void solucion()
    {
        String palabra1, palabra2;

        ObtenerDatoHelper helper = new ObtenerDatoHelper();
        System.out.println("Ingrese una palabra para comparar: ");
        palabra1 = helper.obtenerDato();

        System.out.println("Ingrese otra palabra para comparar: ");
        palabra2 = helper.obtenerDato();

        if(compararPalabras(palabra1, palabra2))
            System.out.println("Las palabras ingresadas son IGUALES\n");
        else
            System.out.println("Las palabras ingresadas son DIFERENTES\n");
    }

}
