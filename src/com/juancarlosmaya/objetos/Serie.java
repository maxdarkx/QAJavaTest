package com.juancarlosmaya.objetos;

public class Serie implements Entregable{
    private String titulo;
    private int numeroDeTemporadas;
    private boolean prestado;
    private String genero;
    private String creador;

    private final int numeroDeTemporadasPredeterminado = 3;
    private final boolean prestadoPredeterminado = false;
    private final String tituloPredeterminado = "Desconocido";
    private final String creadorPredeterminado =  "Desconocido";
    private final String generoPredeterminado = "General";

    public Serie() {
        this.numeroDeTemporadas = numeroDeTemporadasPredeterminado;
        this.prestado = prestadoPredeterminado;
        this.titulo = tituloPredeterminado;
        this.creador = creadorPredeterminado;
        this.genero = generoPredeterminado;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroDeTemporadas = numeroDeTemporadasPredeterminado;
        this.prestado = prestadoPredeterminado;
        this.genero = generoPredeterminado;
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.prestado = prestadoPredeterminado;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int getNumeroDeTemporadasPredeterminado() {
        return numeroDeTemporadasPredeterminado;
    }

    public boolean isPrestadoPredeterminado() {
        return prestadoPredeterminado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString()
    {
        String data =   "Titulo: "+getTitulo()+"\n"+
                        "Creador: "+getCreador()+"\n"+
                        "Genero: "+getGenero()+"\n"+
                        "Numero de Temporadas: "+getNumeroDeTemporadas()+"\n"+
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
        Serie b;
        if(a instanceof Serie)
        {
            b = (Serie) a;
            result = this.getNumeroDeTemporadas() > b.getNumeroDeTemporadas() ? 1:-1;
        }
        return result;
    }
}
