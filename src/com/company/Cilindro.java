package com.company;

public class Cilindro extends Circulo {
    private float altura;

    public Cilindro(){
        super();
        altura = (float)1.0;
    }

    public Cilindro(float altura, float radio, String color){
        super(radio, color);
        this.altura = altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public float calcularVolumen(){
        return (float)super.calcularArea()*altura;
    }

    @Override
    public float calcularArea(){
        return (float) (6.28*radio*altura) + (2*super.calcularArea());
    }

    public void mostrarDatos(){
        System.out.println("------------------------------------------------");
        System.out.println("Radio: "+ getRadio());
        System.out.println("Color: "+ getColor());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Area: "+ calcularArea());
        System.out.println("Volumen: "+ calcularVolumen());
        System.out.println("------------------------------------------------\n");
    }

    @Override
    public String toString() {
        return "Cilindro: subclase de "+ super.toString() + " + altura={"+altura+"}";
    }
}
