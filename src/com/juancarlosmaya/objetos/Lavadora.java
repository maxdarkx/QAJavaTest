package com.juancarlosmaya.objetos;

public class Lavadora extends  Electrodomestico{
    private double carga;

    private static final double cargaPredeterminada = 5.0;

    public Lavadora() {
        super();
        this.carga = cargaPredeterminada;
        precioFinal();
    }

    public Lavadora(float precioBase, int peso) {
        super(precioBase, peso);
        this.carga = cargaPredeterminada;
        precioFinal();
    }

    public Lavadora(float precioBase, String color, char consumoEnergetico, int peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
        precioFinal();
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public void precioFinal()
    {
        super.precioFinal();
        double precio = super.getPrecioFinalVenta();
        if(this.carga > 30)
            precio += 50;
        super.setPrecioFinalVenta(precio);

    }

    @Override
    public String toString()
    {
        return "\nLavadora" +
                "\nColor: "+ super.getColor()+
                "\nPrecio base: $"+super.getPrecioBase()+
                "\nEficiencia energetica: "+super.getConsumoEnergetico()+
                "\nPeso: "+super.getPeso()+" kg"+
                "\nCapacidad de carga: " + this.carga +" kg"+
                "\nPrecio de venta al publico: $"+super.getPrecioFinalVenta()+"\n";
    }
}
