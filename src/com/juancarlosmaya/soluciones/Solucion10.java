package com.juancarlosmaya.soluciones;

import com.juancarlosmaya.principal.ObtenerDatoHelper;

/*
Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
 */
public class Solucion10 {
    public void eliminarEspacios(String frase)
    {
        System.out.println("La frase ingresada fue: \n"+frase);
        System.out.println("La nueva frase es:\n"+frase.replaceAll(" ", "")+"\n");
    }

    public void solucion()
    {
        ObtenerDatoHelper helper = new ObtenerDatoHelper();
        System.out.println("Ingrese una frase para quitarle los espacios: ");
        eliminarEspacios(helper.obtenerDato());
    }
}
