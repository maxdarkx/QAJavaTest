package com.juancarlosmaya.soluciones;
/*
Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de
String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 */

import com.juancarlosmaya.principal.ObtenerDatoHelper;

public class Solucion3 {
    public double calculaAreaCirculo(double radio)
    {
        return Math.PI * radio * radio;
    }

    public void solucion()
    {
        double radio = 0;
        ObtenerDatoHelper helper = new ObtenerDatoHelper();
        System.out.println("Ingrese el radio del circulo a quien se le calculara el area: ");
        radio = helper.obtenerDatoDouble();
        if(radio > 0.0)
            System.out.format("El area del circulo es %.3f metros cuadrados\n\n", calculaAreaCirculo(radio));
        else
            System.out.println("No puede calcularse el area de una circunferencia con radio menor o igual a cero");
    }
}
