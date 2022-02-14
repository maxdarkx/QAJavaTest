package com.juancarlosmaya.soluciones;

import com.juancarlosmaya.principal.ObtenerDatoHelper;

/*
Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola, indicar cual es la
longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
 */
public class Solucion11 {
    public void contarDatosFrase(String frase)
    {
        char [] vocales = {'a','e','i','o','u'};
        int conteo = 0;
        System.out.println("La frase ingresada fue: \n"+frase);
        System.out.println("La frase tiene una longitud de "+frase.length()+" caracteres");
        System.out.println("Contiene las vocales a, e, i, o, u en las siguientes cantidades:");

        for (int i = 0; i < vocales.length; i++) {
            for (int j = 0; j <frase.length() ; j++) {
                if(frase.charAt(j) == vocales[i])
                    conteo++;
            }
            System.out.println(vocales[i]+" = "+conteo);
            conteo = 0;
        }
        System.out.println();
    }

    public void solucion()
    {
        ObtenerDatoHelper helper = new ObtenerDatoHelper();
        System.out.println("Ingrese una frase a veriricar: ");
        contarDatosFrase(helper.obtenerDato());
    }
}
