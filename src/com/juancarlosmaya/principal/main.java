package com.juancarlosmaya.principal;

import com.juancarlosmaya.soluciones.*;

public class main {
    private static ObtenerDatoHelper dato;
    public static void main(String[] args) {
        dato = new ObtenerDatoHelper();

        int seleccion = 1;
        do
        {
            System.out.println("12. Comparar dos palabras");
            System.out.println("13. Fecha de hoy");
            System.out.println("14. Numeros hasta 1000 de 2 en 2");
            System.out.println("15. Menu Gestion Cinematografica");
            System.out.println("16. Menu Personas");
            System.out.println("17. Menu Electrodomesticos");
            System.out.println("18. Menu Series y Videojuegos");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opcion: ");
            seleccion = Integer.parseInt(dato.obtenerDato());

            System.out.println("Ingreso la opcion "+ seleccion+"\n");
            switch (seleccion)
            {
                default:
                    System.out.println("Ha ingresado una opcion incorrecta. Intentelo nuevamente0");
                    break;

                case 0:
                    System.out.println("Ha seleccionado salir, hasta luego");
                    break;

                case 12:
                    Solucion12 sol12 = new Solucion12();
                    sol12.solucion();
                    break;

                case 13:
                    Solucion13 sol13 = new Solucion13();
                    sol13.solucion();
                    break;

                case 14:
                    Solucion14 sol14 = new Solucion14();
                    sol14.solucion();
                    break;

                case 15:
                    Solucion15 sol15 = new Solucion15();
                    sol15.menu();
                    break;

                case 16:
                    Solucion16 sol16 = new Solucion16();
                    sol16.solucion();
                    break;
                case 17:
                    Solucion17 sol17 = new Solucion17();
                    sol17.solucion();
                    break;
                case 18:
                    Solucion18 sol18 = new Solucion18();
                    sol18.solucion();
                    break;
            }
        }while(seleccion != 0);
    }
}
