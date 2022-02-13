package com.juancarlosmaya.principal;

import com.juancarlosmaya.soluciones.Solucion15;
import com.juancarlosmaya.soluciones.Solucion16;
import com.juancarlosmaya.soluciones.Solucion17;

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
                    System.out.println("Ingreso la opcion "+ seleccion);
                    Solucion15 sol15 = new Solucion15();
                    sol15.menu();
                    break;
                case 16:
                    System.out.println("Ingreso la opcion "+ seleccion);
                    Solucion16 sol16 = new Solucion16();
                    sol16.solucion();
                case 17:
                    System.out.println("Ingreso la opcion "+ seleccion);
                    Solucion17 sol17 = new Solucion17();
                    sol17.solucion();
            }
        }while(seleccion != 0);
    }
}
