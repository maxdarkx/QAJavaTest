package com.juancarlosmaya.soluciones;

import com.juancarlosmaya.objetos.Persona;
import com.juancarlosmaya.principal.ObtenerDatoHelper;

import java.util.Locale;

/*Haz una clase llamada Persona que siga las siguientes condiciones:

Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan
 directamente a ellos. Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.


Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo ser
á hombre por defecto, usa una constante para ello.

Se implantarán varios constructores:

Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como parámetro.

Los métodos que se implementaran son:


calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un
valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que está por
debajo de su peso ideal la función devuelve un 0 y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la
función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.

esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No será visible al exterior.
toString(): devuelve toda la información del objeto.
generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método
 será invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.

Métodos set de cada parámetro, excepto de DNI.

Ahora, crea una clase ejecutable que haga lo siguiente:


Pide por teclado el nombre, la edad, sexo, peso y altura.
Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto
obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para
darle a los atributos un valor.

Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
Indicar para cada objeto si es mayor de edad.
Por último, mostrar la información de cada objeto.
*/
public class Solucion16 {
    private ObtenerDatoHelper dato;
    private Persona[] personas;

    public String pesoIdeal(String nombre, int imc)
    {
        String mensaje = nombre + " tiene sobrepeso";
        if(imc  == -1)
        {
            mensaje =  nombre + " se encuentra por debajo de su peso ideal";
        }
        else if(imc == 0)
        {
            mensaje = nombre + " se encuentra en su peso ideal";
        }
        return mensaje;
    }

    public void agregarDatos(String nombre, int edad, char sexo, double peso, double altura)
    {
        personas[0] = new Persona(nombre, edad, sexo, peso, altura);
        personas[1]= new Persona(nombre, edad, sexo);
        personas[2] = new Persona();
        personas[2].setNombre(nombre);
        personas[2].setEdad(edad);
        personas[2].setSexo(sexo);
        personas[2].setPeso(peso);
        personas[2].setAltura(altura);
        personas[2].calcularIMC();

        for (Persona p : personas) {
            System.out.println(pesoIdeal(p.getNombre(), p.getIMC()));
        }

        for(Persona p : personas)
        {
            if(p.esMayorDeEdad())
            {
                System.out.println(p.getNombre()+" es mayor de edad");
            }
            else
            {
                System.out.println(p.getNombre()+" es menor de edad");
            }
        }

        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }


    public void solucion()
    {
        personas = new Persona[3];
        dato = new ObtenerDatoHelper();
        String nombre;
        int edad;
        char sexo;
        double peso;
        double altura;

        System.out.println("Ingrese el nombre del usuario: ");
        nombre = dato.obtenerDato();
        System.out.println("Ingrese la edad del usuario: ");
        edad = dato.obtenerDatoEntero();
        if(edad > 0) {
            System.out.println("Ingrese el Sexo del usuario (M para mujer, H para hombre): ");
            sexo = dato.obtenerDato().toUpperCase().charAt(0);
            System.out.println("Ingrese el peso del usuario: ");
            peso = dato.obtenerDatoDouble();
            if(peso > 0.0) {
                System.out.println("Ingrese la altura del usuario: ");
                altura = dato.obtenerDatoDouble();
                if(altura > 0)
                {
                    agregarDatos(nombre, edad, sexo, peso, altura);
                }
            }
        }
    }
}


