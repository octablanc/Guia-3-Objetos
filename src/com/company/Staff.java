package com.company;

public class Staff extends Persona {
    private int salario;
    private String turno;

    public Staff(){

    }

    public Staff(int salario, String turno, int dni, String nombre, String apellido, String email, String direccion){
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getSalario() {
        return salario;
    }

    public String getTurno() {
        return turno;
    }

    public int salarioAnual(){
        return this.salario * 12;
    }

    @Override
    public String toString() {
        return super.toString() + " Staff{" +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }
}
