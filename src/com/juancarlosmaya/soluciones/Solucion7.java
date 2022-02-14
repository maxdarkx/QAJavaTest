package com.juancarlosmaya.soluciones;

import com.juancarlosmaya.principal.ObtenerDatoHelper;

/*
Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a
pedir (do while), después muestra ese número por consola.
 */
public class Solucion7 {
    public boolean testZero(int numero)
    {
        return numero >= 0;
    }

    public void solucion()
    {
        ObtenerDatoHelper helper = new ObtenerDatoHelper();
        boolean test = false;
        do {
            System.out.println("Ingrese un numero a verificar: ");
            test = testZero(helper.obtenerDatoEntero());
            if (test)
                System.out.println("El numero ingresado es mayor o igual que cero\n");
            else
                System.out.println("El numero ingresado es menor que cero\nIntentelo de nuevo");
        }while(!test);
    }
}
