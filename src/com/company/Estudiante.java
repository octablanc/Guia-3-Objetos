package com.company;

public class Estudiante extends Persona {
    private int añoDeIngreso, cuotaMensual;
    private String carrera;

    public Estudiante(){

    }

    public Estudiante(int dni, String nombre, String apellido, String email, String direccion, int añoDeIngreso, int cuotaMensual, String carrera){
        super(dni, nombre, apellido, email, direccion);
        this.añoDeIngreso = añoDeIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public void setAñoDeIngreso(int añoDeIngreso) {
        this.añoDeIngreso = añoDeIngreso;
    }

    public void setCuotaMensual(int cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public int getCuotaMensual() {
        return cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return super.toString() +" Estudiante{" +
                "añoDeIngreso=" + añoDeIngreso +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
