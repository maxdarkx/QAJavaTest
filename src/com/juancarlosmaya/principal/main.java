package com.juancarlosmaya.principal;

import com.juancarlosmaya.soluciones.Solucion15;
import com.juancarlosmaya.soluciones.Solucion16;
import com.juancarlosmaya.soluciones.Solucion17;
import com.juancarlosmaya.soluciones.Solucion18;

public class main {
    private static ObtenerDatoHelper dato;
    public static void main(String[] args) {
        dato = new ObtenerDatoHelper();

        int seleccion = 1;
        do
        {
            System.out.println("15. Menu Gestion Cinematografica");
            System.out.println("16. Menu Personas");
            System.out.println("17. Menu Electrodomesticos");
            System.out.println("18. Menu Series y Videojuegos");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opcion: ");
            seleccion = Integer.parseInt(dato.obtenerDato());

            switch (seleccion)
            {
                default:
                    System.out.println("Ha ingresado una opcion incorrecta. Intentelo nuevamente0");
                    break;
                case 0:
                    System.out.println("Ha seleccionado salir, hasta luego");
                    break;
                case 15:
                    System.out.println("Ingreso la opcion "+ seleccion+"\n");
                    Solucion15 sol15 = new Solucion15();
                    sol15.menu();
                    break;
                case 16:
                    System.out.println("Ingreso la opcion "+ seleccion+"\n");
                    Solucion16 sol16 = new Solucion16();
                    sol16.solucion();
                    break;
                case 17:
                    System.out.println("Ingreso la opcion "+ seleccion+"\n");
                    Solucion17 sol17 = new Solucion17();
                    sol17.solucion();
                    break;
                case 18:
                    System.out.println("Ingreso la opcion "+ seleccion+"\n");
                    Solucion18 sol18 = new Solucion18();
                    sol18.solucion();
                    break;
            }
        }while(seleccion != 0);
    }
}
