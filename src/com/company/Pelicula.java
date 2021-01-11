package com.company;

import javax.swing.*;

public class Pelicula {
    //Atributos
    private  String titulo ;
    private float prezo;
    //Constructor


    public Pelicula() {
    }

    public Pelicula(String titulo, float prezo) {
        this.titulo = titulo;
        this.prezo = prezo;
    }
    //Metodos
    public void darPrezo(float valor){
        prezo=valor;
    }

    //Metodos de acceso

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public float getPrezo() {
        return prezo;
    }
    //Otros metodos

}
