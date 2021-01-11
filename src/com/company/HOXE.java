package com.company;


public class HOXE{
    private Pelicula novoPrezo;
    private Pelicula titulo;
    public HOXE(){}

    public Pelicula getNovoPrezo() {
        return novoPrezo;
    }

    public void visualiza(){
       System.out.println("O prezo é :" +novoPrezo + "O titulo é : "+titulo);

   }

    public float rebaixa(float valor1){
        return novoPrezo.getPrezo()-novoPrezo.getPrezo()*valor1;



    }



}
