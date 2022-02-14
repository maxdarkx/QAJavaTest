package com.juancarlosmaya.soluciones;

/*Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero introducido
hasta 1000 con saltos de 2 en 2.
 */

import com.juancarlosmaya.principal.ObtenerDatoHelper;

public class Solucion14 {

    public void solucion()
    {
        int dato;
        ObtenerDatoHelper helper = new ObtenerDatoHelper();
        System.out.println("Ingrese un numero:");
        dato = helper.obtenerDatoEntero();

        if(dato > 0)
            numerosHasta1000de2en2(dato);

    }

    private void numerosHasta1000de2en2(int dato) {
        System.out.print("[");

        for (int k = 0,i = dato; i <= 1000; i=i+2, k++) {
            System.out.print(i);
            if(i <= 998)
                System.out.print(",\t");
            if(k > 20)
            {
                System.out.println();
                k=0;
            }
        }
        System.out.println("]\n");
    }
}
