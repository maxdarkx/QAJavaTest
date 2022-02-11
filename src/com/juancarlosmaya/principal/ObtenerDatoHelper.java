package com.juancarlosmaya.principal;

import java.util.Scanner;

public class ObtenerDatoHelper {
    public String obtenerDato()
    {
        Scanner receptorDatos = new Scanner(System.in);
        return receptorDatos.nextLine();
    }
}
