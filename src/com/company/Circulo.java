package com.company;

public class Circulo {
    protected float radio;
    protected String color;

    public  Circulo(){
        radio =  (float)1.0;
        color = "Rojo";
    }

    public  Circulo(float radio, String  color){
        this.radio = radio;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public float calcularArea(){
        return (float)3.14*(radio*radio);
    }

    public void mostrarDatos(){
        System.out.println("Color: "+ color);
        System.out.println("Radio: "+ radio);
        System.out.println("Area: "+ calcularArea());
    }


    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
