package com.juancarlosmaya.soluciones;
/*
Declara 2 variables numéricas (con el valor que desees), e indica cual es mayor de los dos. Si son iguales
 indicarlo también. Ve cambiando los valores para comprobar que funciona.
Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.
 */

import com.juancarlosmaya.principal.ObtenerDatoHelper;

public class Solucion2 {
    public void comparar(int a, int b)
    {
        if(a > b)
            System.out.println( a + " es mayor que "+b+"\n");
        else if(a == b)
            System.out.println(a + " es igual que "+b+"\n");
        else
            System.out.println( b + " es mayor que "+a+"\n");
    }

    public void solucion()
    {
        ObtenerDatoHelper dato = new ObtenerDatoHelper();
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Ingrese el primer numero a comparar");
        numero1 = dato.obtenerDatoEntero();
        System.out.println("Ingrese el segundo numero a comparar");
        numero2 = dato.obtenerDatoEntero();
        comparar(numero1, numero2);
    }
}
