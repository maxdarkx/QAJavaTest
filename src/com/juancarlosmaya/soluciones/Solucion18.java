package com.juancarlosmaya.soluciones;

import com.juancarlosmaya.objetos.Serie;
import com.juancarlosmaya.objetos.Videojuego;

import java.util.ArrayList;
import java.util.stream.Collectors;

/*Crear una clase llamada Serie con las siguientes características:
Sus atributos son título, numero de temporadas, entregado, género y creador.
Por defecto, el número de temporadas es de 3 temporadas y entregado false. El resto de atributos serán valores por
defecto según el tipo del atributo.
Los constructores que se implementarán serán:
Un constructor por defecto.
Un constructor con el titulo y creador. El resto por defecto.
Un constructor con todos los atributos, excepto de entregado.

Los métodos que se implementara serán:

Métodos get de todos los atributos, excepto de entregado.
Métodos set de todos los atributos, excepto de entregado.
Sobrescribe los métodos toString.

Crearemos una clase Videojuego con las siguientes características:

Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos serán valores por defecto
 según el tipo del atributo.

Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el titulo y horas estimadas. El resto por defecto.
Un constructor con todos los atributos, excepto de entregado.

Los métodos que se implementara serán:
Métodos get de todos los atributos, excepto de entregado.
Métodos set de todos los atributos, excepto de entregado.
Sobrescribe los métodos toString.

Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en común, por eso vamos a hacer una
interfaz llamada Entregable con los siguientes métodos:

entregar(): cambia el atributo prestado a true.
devolver(): cambia el atributo prestado a false.
isEntregado(): devuelve el estado del atributo prestado.
Método compareTo (Object a), compara las horas estimadas en los videojuegos y en las series el numero de temporadas.
Como parámetro que tenga un objeto, no es necesario que implementes la interfaz Comparable. Recuerda el uso de los
casting de objetos.

Implementa los anteriores métodos en las clases Videojuego y Serie. Ahora crea una aplicación ejecutable y realiza lo
 siguiente:

Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
Entrega algunos Videojuegos y Series con el método entregar().
Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas. Muéstralos en pantalla con
toda su información (usa el método toString()).

* */

public class Solucion18 {
    ArrayList <Serie> listaSeries;
    ArrayList <Videojuego> listaVideojuegos;

    public void solucion()
    {
        long conteoVideojuegosEntregados = 0;
        long conteoSeriesEntregadas = 0;
        Videojuego videojuegoMasLargo;
        Serie serieMasLarga;
        listaSeries = new ArrayList<Serie>();
        listaVideojuegos = new ArrayList<Videojuego>();

        listaSeries.add(new Serie("Naruto Shippuden", 15, "Aventuras", "Masashi Kishimoto"));
        listaSeries.add(new Serie("Game of thrones", 9, "Aventuras", "George R.R. Martin"));
        listaSeries.add(new Serie("Battlestar Galactica", 11, "Ciencia Ficcion", "Glen E. Larson"));
        listaSeries.add(new Serie("Slayers", "Hajime Kanzaka"));
        listaSeries.add(new Serie("Vivy: Fluorite Eye's Song", 2, "Ciencia Ficcion", "Tappei Nagatsuki, Eiji Umehara"));

        listaVideojuegos.add(new Videojuego("Halo Reach", 35, "First Person Shooter", "Bungie"));
        listaVideojuegos.add(new Videojuego("Apex Legends", 40, "Battle Royale", "Respawn Entertaiment"));
        listaVideojuegos.add(new Videojuego("Resident Evil 2", 20, "Survival Horror", "Capcom"));
        listaVideojuegos.add(new Videojuego("Control", 2));
        listaVideojuegos.add(new Videojuego("Crysis 3", 1));

        listaVideojuegos.get(0).entregar();
        listaVideojuegos.get(2).entregar();
        listaVideojuegos.get(4).entregar();
        listaSeries.get(1).entregar();
        listaSeries.get(3).entregar();

        conteoVideojuegosEntregados = listaVideojuegos.stream().filter(Videojuego::isPrestado).count();
        listaVideojuegos.stream().filter(Videojuego::isPrestado).forEach(Videojuego::devolver);
        System.out.println("Habian "+ conteoVideojuegosEntregados +" videojuegos prestados.");

        conteoSeriesEntregadas = listaSeries.stream().filter(Serie::isPrestado).count();
        listaSeries.stream().filter(Serie::isPrestado).forEach(Serie::devolver);
        System.out.println("Habian "+ conteoSeriesEntregadas +" series prestadas.");
        System.out.println();

        videojuegoMasLargo = listaVideojuegos.stream().max(Videojuego::compareTo).get();
        System.out.println("El videojuego mas largo es: \n"+ videojuegoMasLargo+"\n");
        serieMasLarga = listaSeries.stream().max(Serie::compareTo).get();
        System.out.println("La serie mas larga es: \n"+ serieMasLarga+"\n");

        System.out.println("Lista de videojuegos:\n"+listaVideojuegos.stream().map(Videojuego::toString).collect(Collectors.joining("\n\n"))+"\n");
        System.out.println("Lista de series:\n"+listaSeries.stream().map(Serie::toString).collect(Collectors.joining("\n\n"))+"\n");
        System.out.println();

    }

}
