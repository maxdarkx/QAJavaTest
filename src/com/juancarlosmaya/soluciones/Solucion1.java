package com.juancarlosmaya.soluciones;
/*
Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales
indicarlo también. Ve cambiando los valores para comprobar que funciona.
 */
public class Solucion1 {
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
        System.out.println("Se comparara 5 con 8");
        comparar(5,8);
    }
}
