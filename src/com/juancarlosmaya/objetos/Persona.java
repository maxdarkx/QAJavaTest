package com.juancarlosmaya.objetos;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private float peso;
    private float altura;
    private int IMC;

    public Persona()
    {
        this.nombre = "Pepito Perez";
        this.edad = 18;
        this.sexo = 'M';
        this.DNI = generarDNI();
        this.peso = 60;
        this.altura = 1.60F;
        calcularIMC();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generarDNI();
        this.peso = 60;
        this.altura = 1.60F;
        comprobarSexo();
        calcularIMC();
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo();
        calcularIMC();
    }

    public void calcularIMC()
    {
        int sol = 1;
        float peso = this.peso;
        float altura = this.altura;
        float imc = peso / (altura * altura);
        if(imc < 20.0)
        {
            sol = -1;
        }
        else if(imc <= 25.0)
        {
            sol = 0;
        }
        this.IMC = sol;
    }

    public boolean esMayorDeEdad()
    {
        int edad = this.edad;
        if(edad >= 18)
            return true;
        return false;
    }

    private void comprobarSexo()
    {
        char sexo = this.sexo;
        if(sexo != 'H' && sexo != 'M')
        {
            this.sexo = 'H';
        }
    }

    public String toString()
    {
        String datos = "Nombre : "+this.nombre+"\n";
        datos = datos.concat("Edad : "+this.edad+"\n");
        if(this.sexo == 'H') {
            datos = datos.concat("Sexo :  Masculino \n");
        }
        else if(this.sexo == 'M'){
            datos = datos.concat("Sexo :  Femenino \n");
        }
        datos = datos.concat("DNI : "+this.DNI+"\n");
        datos = datos.concat("Peso : "+this.peso+"\n");
        datos = datos.concat("Altura : "+this.altura+"\n");
        datos = datos.concat("IMC : "+this.IMC+"\n");
        return datos;
    }
    private String generarDNI()
    {
        String dni = "";
        int dniNumero= (int)(100000000* Math.random());
        int index = dniNumero%23;
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        return String.valueOf(dniNumero)+caracteres.charAt(index);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
        comprobarSexo();
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public int getIMC() {
        return IMC;
    }
}
