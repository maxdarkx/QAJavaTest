package com.juancarlosmaya.principal;

import java.util.Scanner;

public class ObtenerDatoHelper {
    public String obtenerDato()
    {
        Scanner receptorDatos = new Scanner(System.in);
        return receptorDatos.nextLine();
    }

    public int obtenerDatoEntero()
    {
        Scanner receptorDatos = new Scanner(System.in);
        int dato = -1;
        try {
            dato = Integer.parseInt(receptorDatos.nextLine());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Debe ingresar un dato valido\n");
        }
        return dato;
    }

    public double obtenerDatoDouble()
    {
        Scanner receptorDatos = new Scanner(System.in);
        double dato = -1.0;
        try {
            dato = Double.parseDouble(receptorDatos.nextLine());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Debe ingresar un dato valido\n");
        }
        return dato;
    }
}
