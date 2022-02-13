package com.juancarlosmaya.soluciones;

import com.juancarlosmaya.principal.ObtenerDatoHelper;

import java.util.Scanner;

public class Solucion15 {
    /*Hacer un programa que muestre el siguiente menú de opciones
****** GESTION CINEMATOGRÁFICA ********
1-NUEVO ACTOR
2-BUSCAR ACTOR
3-ELIMINAR ACTOR
4-MODIFICAR ACTOR
5-VER TODOS LOS ACTORES
6- VER PELICULAS DE LOS ACTORES

7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
8-SALIR


EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO
EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.

*/
    private ObtenerDatoHelper dato;

    public Solucion15(){}

    public void menu()
    {
        dato = new ObtenerDatoHelper();
        int seleccion = 0;
        do
        {
            System.out.println("****** GESTION CINEMATOGRÁFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR\n");
            seleccion = Integer.parseInt(dato.obtenerDato());
            switch (seleccion)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    System.out.println("Ingreso la opcion "+ seleccion);
                    break;
                case 8:
                    System.out.println("Ha seleccionado salir del MENU, hasta luego");
                    break;
                default:
                    System.out.println("Ha ingresado una opcion incorrecta. Intentelo nuevamente");
                    break;
            }
            System.out.println();
        }while(seleccion != 8);
    }
}
