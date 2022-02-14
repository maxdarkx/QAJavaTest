package com.juancarlosmaya.soluciones;
/*
Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch
 para ello.
 */

import com.juancarlosmaya.principal.ObtenerDatoHelper;

public class Solucion8 {
    public void solucion()
    {
        ObtenerDatoHelper helper = new ObtenerDatoHelper();
        System.out.println("Ingrese el dia de la semana a verificar");
        verificarDiaDeLaSemana(helper.obtenerDato());
    }

    private void verificarDiaDeLaSemana(String dia) {
        String verificacion = "";
        boolean test = false;
        switch (dia.toLowerCase())
        {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                verificacion = "Laborable";
                test = true;
                break;
            case "sabado":
            case "domingo":
                verificacion = "No Laborable";
                test = true;
            default:
                verificacion = "Ingrese un dia valido\n";
        }
        if(test)
            System.out.println("El "+dia+" es un dia "+verificacion+"\n");
        else
            System.out.println(verificacion);
    }
}
