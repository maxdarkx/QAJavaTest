package com.juancarlosmaya.soluciones;

import com.juancarlosmaya.principal.ObtenerDatoHelper;

/*
Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior por una e,
adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.
 */
public class Solucion9 {
    private String texto;

    public void concatenarFrase(String frase)
    {
        System.out.println("La frase ingresada fue: \n"+frase);
    System.out.println("La nueva frase es:\n"+this.texto.replaceAll("a", "e")+" "+frase+"\n");
    }

    public void solucion()
    {
        ObtenerDatoHelper helper = new ObtenerDatoHelper();
        this.texto = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("Ingrese una frase para concatenar: ");
        concatenarFrase(helper.obtenerDato());
    }
}
