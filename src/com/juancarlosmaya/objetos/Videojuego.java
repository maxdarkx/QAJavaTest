package com.juancarlosmaya.objetos;

public class Videojuego implements Entregable{
    private String titulo;
    private int horasEstimadas;
    private boolean prestado;
    private String genero;
    private String compania;

    private final String tituloPredeterminado = "Desconocido";
    private final int horasEstimadasPredeterminadas = 10;
    private final boolean prestadoPredeterminado = false;
    private final String generoPredeterminado = "Desconocido";
    private final String companiaPredeterminada = "Desconocida";

    public Videojuego() {
        this.titulo = tituloPredeterminado;
        this.horasEstimadas = horasEstimadasPredeterminadas;
        this.prestado = prestadoPredeterminado;
        this.genero = generoPredeterminado;
        this.compania = companiaPredeterminada;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.prestado = prestadoPredeterminado;
        this.genero = generoPredeterminado;
        this.compania = companiaPredeterminada;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.prestado = prestadoPredeterminado;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString()
    {
        String data =   "Titulo: "+getTitulo()+"\n"+
                "Horas Estimadas: "+getHorasEstimadas()+"\n"+
                "Genero: "+getGenero()+"\n"+
                "Compañia: "+getCompania()+"\n"+
                "Prestado: ";
        if(this.prestado)
            data = data.concat("Si");
        else
            data = data.concat("No");

        return data;
    }

    @Override
    public void entregar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public boolean isPrestado() {
        return this.prestado;
    }

    @Override
    public int compareTo(Object a) {
        int result = 0;
        Videojuego b;
        if(a instanceof Videojuego)
        {
            b = (Videojuego) a;
            result = this.getHorasEstimadas() > b.getHorasEstimadas() ? 1:-1;
        }
        return result;
    }
}
