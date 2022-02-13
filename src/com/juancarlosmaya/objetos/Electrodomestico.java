package com.juancarlosmaya.objetos;

import java.util.ArrayList;
import java.util.Locale;

public class Electrodomestico {
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;
    private ArrayList <String> coloresDisponibles;
    private double precioFinalVenta;

    private static final String colorPredeterminado = "blanco";
    private static final char consumoEnergeticoPredeterminado = 'F';
    private static final double precioBasePredeterminado = 100.0;
    private static final int pesoPredeterminado = 5;

    public Electrodomestico() {
        this.color = colorPredeterminado;
        this.consumoEnergetico = consumoEnergeticoPredeterminado;
        this.precioBase = precioBasePredeterminado;
        this.peso = pesoPredeterminado;
        precioFinal();
    }

    public Electrodomestico(float precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = colorPredeterminado;
        this.consumoEnergetico = consumoEnergeticoPredeterminado;
        precioFinal();
    }

    public Electrodomestico(float precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
        precioFinal();
    }

    private void comprobarConsumoEnergetico(char consumo)
    {
        consumo = String.valueOf(consumo).toUpperCase().charAt(0);
        if(consumo > 64 && consumo < 71) {
            this.consumoEnergetico = consumo;
        }
        else{
            this.consumoEnergetico= 'F';
        }
    }
    private void comprobarColor(String color)
    {
        coloresDisponibles =  new ArrayList<String>();
        coloresDisponibles.add("blanco");
        coloresDisponibles.add("negro");
        coloresDisponibles.add("rojo");
        coloresDisponibles.add("azul");
        coloresDisponibles.add("gris");

        if( coloresDisponibles.contains(color))
            this.color = color;
        else
            this.color = coloresDisponibles.get(0);
    }

    public void precioFinal()
    {
        double precio = this.precioBase;
        precio = calculaPrecioSegunEficiencia(precio);
        precio = calculaPrecioSegunPeso(precio);
        this.precioFinalVenta = precio;
    }

    private double calculaPrecioSegunEficiencia(double precio) {
        switch(this.consumoEnergetico) {
            case 'A':
                precio += 20;
            case 'B':
                precio += 20;
            case 'C':
                precio += 10;
            case 'D':
                precio += 20;
            case 'E':
                precio += 20;
            default:
                precio += 10;
        }
        return precio;
    }

    private double calculaPrecioSegunPeso(double precio) {
        if(this.peso > 0) {
            if (this.peso < 19)
                precio += 10;
            else if (this.peso <= 49)
                precio += 50;
            else if (this.peso <= 79)
                precio += 80;
            else if (this.peso > 80)
                precio += 100;
        }
        return precio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioFinalVenta() {
        return precioFinalVenta;
    }

    public void setPrecioFinalVenta(double precioFinalVenta) {
        this.precioFinalVenta = precioFinalVenta;
    }

    @Override
    public String toString()
    {
        return "\nElectrodomestico" +
                "\nColor: "+ this.color+
                "\nPrecio base: $"+this.precioBase+
                "\nEficiencia energetica: "+this.consumoEnergetico+
                "\nPeso: "+this.peso+" kg"+
                "\nPrecio de venta al publico: $"+this.precioFinalVenta+"\n";
    }
}
