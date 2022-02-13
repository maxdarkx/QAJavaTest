package com.juancarlosmaya.objetos;

public class Televisor extends Electrodomestico{
    private int resolucion;
    private  boolean sintonizador;

    private final int resolucionPorDefecto = 20;
    private final boolean sintonizadorPorDefecto = false;

    public Televisor() {
        super();
        this.resolucion = resolucionPorDefecto;
        this.sintonizador = sintonizadorPorDefecto;
    }

    public Televisor(float precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion = resolucionPorDefecto;
        this.sintonizador = sintonizadorPorDefecto;
    }

    public Televisor(float precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizador) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    @Override
    public void precioFinal()
    {
        super.precioFinal();
        double precio = super.getPrecioFinalVenta();
        if(this.resolucion > 40)
            precio = precio * 1.3;
        if(this.sintonizador)
            precio += 50;
        super.setPrecioFinalVenta(precio);
    }

    @Override
    public String toString()
    {
        String dato =   "Televisor" +
            "\nColor :"+ super.getColor()+
            "\nPrecio base: $"+super.getPrecioBase()+
            "\nEficiencia energetica :"+super.getConsumoEnergetico()+
            "\nPeso: "+super.getPeso()+" kg";

        if(this.sintonizador)
            dato  = dato.concat("\nSintonizador TDT: incluido");
        else
            dato  = dato.concat("\nSintonizador TDT: NO INCLUIDO");

        dato = dato.concat("\nTamaño de la pantalla : "+this.resolucion+" pulgadas");
        dato = dato.concat("\nPrecio de venta al publico: $"+super.getPrecioFinalVenta()+"\n");
        return dato;
    }
}
