package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    ej1();
    }

    public static void ej1(){
        Cilindro nuevoCil = new Cilindro();

        nuevoCil.mostrarDatos();

        Cilindro cil2 = new Cilindro((float)10.0, (float)3.0, "Verde");

        cil2.mostrarDatos();
        System.out.println(cil2.toString());
    }
}
