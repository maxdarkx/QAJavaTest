package com.juancarlosmaya.soluciones;

import com.juancarlosmaya.principal.ObtenerDatoHelper;

/*
Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
 El IVA sera una constante que sera del 21%.
 */
public class Solucion4 {

    public void solucion()
    {
        double valorIva;
        double valorProducto;
        ObtenerDatoHelper helper = new ObtenerDatoHelper();
        System.out.println("Ingrese el precio del producto");
        valorProducto = helper.obtenerDatoDouble();

        if(valorProducto >0) {
            valorIva = calcularIva(valorProducto);
            System.out.println("El precio base del producto fue: " + valorProducto);
            System.out.println("El valor del IVA (21%) fue de: " + valorIva);
            System.out.println("El valor final del producto es: " + (valorProducto + valorIva) + "\n");
        }
    }

    private double calcularIva(double valorProducto) {
        return valorProducto * 0.21;
    }

}
