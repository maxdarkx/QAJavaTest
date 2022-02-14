package com.juancarlosmaya.principal;

import com.juancarlosmaya.soluciones.*;

public class main {
    private static ObtenerDatoHelper dato;
    public static void main(String[] args) {
        dato = new ObtenerDatoHelper();

        int seleccion = 1;
        do
        {
            System.out.println("1. Indica cual entre dos numeros es mayor o si son iguales");
            System.out.println("2. Indica cual entre dos numeros ingresados por teclado es mayor o si son iguales\"");
            System.out.println("3. Calcular el area del circulo");
            System.out.println("4. Calcular el IVA (21%) de un producto");
            System.out.println("5. Mostrar los numeros pares e impares hasta el 100 (WHILE)");
            System.out.println("6. Mostrar los numeros pares e impares hasta el 100 (FOR)");
            System.out.println("7. Comparar un numero con cero");
            System.out.println("8. Verificar si el dia de la semana es laborable");
            System.out.println("9. Cambiar y concatenar frases");
            System.out.println("10. Eliminar espacios de una frase");
            System.out.println("11. Obtener datos de una frase");
            System.out.println("12. Comparar dos palabras");
            System.out.println("13. Fecha de hoy");
            System.out.println("14. Numeros hasta 1000 de 2 en 2");
            System.out.println("15. Menu Gestion Cinematografica");
            System.out.println("16. Menu Personas");
            System.out.println("17. Menu Electrodomesticos");
            System.out.println("18. Menu Series y Videojuegos");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opcion: ");
            seleccion = dato.obtenerDatoEntero();

            System.out.println("Ingreso la opcion "+ seleccion+"\n");
            switch (seleccion)
            {
                default:
                    System.out.println("Ha ingresado una opcion incorrecta. Intentelo nuevamente0");
                    break;

                case 0:
                    System.out.println("Ha seleccionado salir, hasta luego");
                    break;

                case 1:
                    Solucion1 sol1 = new Solucion1();
                    sol1.solucion();
                    break;

                case 2:
                    Solucion2 sol2 = new Solucion2();
                    sol2.solucion();
                    break;

                case 3:
                    Solucion3 sol3 = new Solucion3();
                    sol3.solucion();
                    break;

                case 4:
                    Solucion4 sol4 = new Solucion4();
                    sol4.solucion();
                    break;

                case 5:
                    Solucion5 sol5 = new Solucion5();
                    sol5.solucion();
                    break;

                case 6:
                    Solucion6 sol6 = new Solucion6();
                    sol6.solucion();
                    break;

                case 7:
                    Solucion7 sol7 = new Solucion7();
                    sol7.solucion();
                    break;

                case 8:
                    Solucion8 sol8 = new Solucion8();
                    sol8.solucion();
                    break;

                case 9:
                    Solucion9 sol9 = new Solucion9();
                    sol9.solucion();
                    break;

                case 10:
                    Solucion10 sol10 = new Solucion10();
                    sol10.solucion();
                    break;
                case 11:
                    Solucion11 sol11 = new Solucion11();
                    sol11.solucion();
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
