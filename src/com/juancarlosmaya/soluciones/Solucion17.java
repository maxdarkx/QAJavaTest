package com.juancarlosmaya.soluciones;
/*Crearemos una superclase llamada Electrodoméstico con las siguientes características:
Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso.
Indican que se podrán heredar.

Por defecto, el color será blanco, el consumo energético será F, el precioBase es de 100 € y el peso de 5 kg.
Usa constantes para ello.
Los colores disponibles son blancos, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o
en minúsculas.
Los constructores que se implementarán serán:

Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con todos los atributos.

Los métodos que implementara serán:

Métodos get de todos los atributos.
comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra
 por defecto. Se invocará al crear el objeto y no será visible.

comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto.
Se invocará al crear el objeto y no será visible.

precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista
de precios:


Crearemos una subclase llamada Lavadora con las siguientes características:

Su atributo es carga, además de los atributos heredados.
Por defecto, la carga es de 5 kg. Usa una constante para ello.
Los constructores que se implementarán serán:

Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de
la clase padre.

Los métodos que se implementara serán:
Método get de carga.

precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio.
Llama al método padre y añade el código necesario. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.

Crearemos una subclase llamada Television con las siguientes características:

Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
Por defecto, la resolución será de 20 pulgadas y el sintonizador será false.
Los constructores que se implementarán serán:
Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al
constructor de la clase padre.

Los métodos que se implementara serán:
Método get de resolución y sintonizador TDT.
precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador
TDT incorporado, aumentara 50 €. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben
 afectar al precio.

Ahora crea una clase ejecutable que realice lo siguiente:

Crea un array de Electrodomesticos de 10 posiciones.
Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
Ahora, recorre este array y ejecuta el método precioFinal().
Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras
por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y
Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.

Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, una lavadora de 200 y una televisión de 500,
el resultado final sera de 1000 (300+200+500) para electrodomésticos, 200 para lavadora y 500 para televisión.*/


import com.juancarlosmaya.objetos.Electrodomestico;
import com.juancarlosmaya.objetos.Lavadora;
import com.juancarlosmaya.objetos.Televisor;

import java.util.ArrayList;

public class Solucion17 {
    public ArrayList<Electrodomestico> almacen;

    public void solucion() {
        double precioTotalElectodomesticos = 0.0;
        double precioTotalLavadoras = 0.0;
        double precioTotalTelevisores = 0.0;
        double precioTotalAlmacen = 0.0;
        almacen = new ArrayList<Electrodomestico>();
        almacen.add(new Electrodomestico());
        almacen.add(new Electrodomestico(200, 55));
        almacen.add(new Electrodomestico(150, 10));
        almacen.add(new Electrodomestico(200, "rojo", 'C', 25));

        almacen.add(new Lavadora());
        almacen.add(new Lavadora(200, 25));
        almacen.add(new Lavadora(220, "negro", 'B', 35, 40));

        almacen.add(new Televisor());
        almacen.add(new Televisor(250, 10));
        almacen.add(new Televisor(220, "negro", 'B', 35, 65, true));

        almacen.forEach((item) -> item.precioFinal());

        for(Electrodomestico item: almacen)
        {
            if (item instanceof Lavadora)
                precioTotalLavadoras += item.getPrecioFinalVenta();
            else if (item instanceof Televisor)
                precioTotalTelevisores += item.getPrecioFinalVenta();
            else if(item instanceof Electrodomestico)
                precioTotalElectodomesticos += item.getPrecioFinalVenta();
        }
        precioTotalAlmacen = precioTotalElectodomesticos + precioTotalLavadoras + precioTotalTelevisores;
        System.out.println("El precio total de todos los electrodomesticos fue: $"+ precioTotalElectodomesticos);
        System.out.println("El precio total de todas las Lavadoras fue: $"+ precioTotalLavadoras);
        System.out.println("El precio total de todos los televisores fue: $"+ precioTotalTelevisores);

        System.out.println("El precio total de todo el almacen fue: $"+ precioTotalAlmacen);
        almacen.forEach((item)-> System.out.println(item.toString()));
    }
}
