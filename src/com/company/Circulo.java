package com.company;

public class Circulo {
    protected float radio;
    protected String color;

    public  Circulo(){
        radio =  (float)1.0;
        color = "Rojo";
    }

    public float calcularArea(){
        return (float)3.14*(radio*radio);
    }

    public void mostrarDatos(){
        System.out.println("Color: "+ color);
        System.out.println("Radio: "+ radio);
        System.out.println("Area: "+ calcularArea());
    }
}
