package com.juancarlosmaya.soluciones;
/*
Muestra los números impares y pares del 1 al 100 (ambos incluidos) usando un ciclo while.
 */
public class Solucion5 {
    public void paresImpares()
    {
        System.out.print("Pares: \n[");
        int i = 1;
        int k = 0;
        while(i<=100) {
            if(i % 2 == 0)
            {
                System.out.print(i);
                k++;
                if(i<100) {
                    if(k > 40) {
                        System.out.println();
                        k = 0;
                    }
                    else {
                        System.out.print(", ");
                    }
                }
            }
            i++;
        }

        System.out.println("]\n");
        System.out.print("Impares: \n[");
        i = 0;
        while(i<=100){
            if(i % 2 != 0)
            {
                System.out.print(i);
                k++;
                if(i<99) {
                    if(k > 40) {
                        System.out.println();
                        k = 0;
                    }
                    else {
                        System.out.print(", ");
                    }
                }
            }
            i++;
        }
        System.out.println("]\n");
    }




    public void solucion()
    {
        System.out.println("A continuacion se mostraran los numeros pares e impares del 1 al 100\n");
        paresImpares();
    }
}
