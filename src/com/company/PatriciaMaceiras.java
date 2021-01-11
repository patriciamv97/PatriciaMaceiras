package com.company;

import javax.swing.*;


public class PatriciaMaceiras {

    public static void main(String[] args) {
        int resposta;
        Pelicula peli1 = new Pelicula();
        peli1.setTitulo("Contos de Vigo");
        peli1.darPrezo(15.30f);
        float novoPrezo = darPrezo1("Introduzca o novo prezo da peli");
        peli1.setPrezo(novoPrezo);
        JOptionPane.showMessageDialog(null,"O novo prezo é : "+ peli1.getPrezo()+ "\nO titulo é :"+peli1.getTitulo());
        do {

            String titulo2 =lerString("Introduzca o titulo da seguinte pelicula");
            Float novoPrezo2= darPrezo1("Introduzca o prezo da seguinte pelicula");
            float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce a porcentaxe de descuento"));
            HOXE peli2 = new HOXE();
            peli1.setPrezo(novoPrezo2);
            peli1.setTitulo(titulo2);
            peli2.visualiza();
            JOptionPane.showMessageDialog(null,peli2.rebaixa(valor2));
            resposta = Integer.parseInt(JOptionPane.showInputDialog("¿Desexa rematar?, para rematar prema 0"));
        } while (resposta != 0);

    }

    public  static float darPrezo1(String mensaxe) {
        float dato;
        do {
            dato = Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        } while (dato <= 0);
        return dato;
    }

    public static   String lerString(String mensaxe) {
        return JOptionPane.showInputDialog(mensaxe);

    }

}
