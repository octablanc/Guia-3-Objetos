package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    //ej1();
    ej2();
    }

    public static void ej1(){
        Cilindro nuevoCil = new Cilindro();

        nuevoCil.mostrarDatos();

        Cilindro cil2 = new Cilindro((float)10.0, (float)3.0, "Verde");

        cil2.mostrarDatos();
        System.out.println(cil2.toString());
    }

    public static void ej2(){
        Estudiante estudiante1, estudiante2, estudiante3, estudiante4;
        Staff staff1, staff2, staff3, staff4;

        estudiante1 = new Estudiante(
                40432054,
                "Juan",
                "Gomez",
                "juangomez@gmail.com",
                "La Madrid 2032",
                2017,
                1800,
                "Programacion"
        );
        estudiante2= new Estudiante(
                40433254,
                "Federico",
                "Torrente",
                "federicotorrente@gmail.com",
                "Buenos Aires 3102",
                2017,
                1800,
                "Programacion"
        );
        estudiante3= new Estudiante(
                39567904,
                "Anabella",
                "Nadotti",
                "anabellanadotti@gmail.com",
                "Corrientes 2851",
                2017,
                1800,
                "Programacion"
        );
        estudiante4= new Estudiante(
                41802199,
                "Kiara",
                "Puliccino",
                "kiarpuliccino@gmail.com",
                "9 de Julio 1610",
                2017,
                1800,
                "Programacion"
        );

        staff1 = new Staff(
                20000,
                "mañana",
                32542129,
                "Mariano",
                "Nava",
                "marianonava@gmail.com",
                "Tomas Guido 2479"
        );
        staff2 = new Staff(
                20000,
                "mañana",
                32542129,
                "Silvia",
                "Aguero",
                "silviaaguero@gmail.com",
                "La Pampa 4468"
        );
        staff3 = new Staff(
                20000,
                "mañana",
                32542129,
                "Esteban",
                "Rodriguez",
                "estebanrodriguez@gmail.com",
                "Olazabal 2179"
        );
        staff4 = new Staff(
                20000,
                "mañana",
                32542129,
                "Julieta",
                "Rellero",
                "julietarellero@gmail.com",
                "Alvarado 1702"
        );

        Object[] personas = new Object[8];

        personas[0] = estudiante1;
        personas[1] = estudiante2;
        personas[2] = estudiante3;
        personas[3] = estudiante4;
        personas[4] = staff1;
        personas[5] = staff2;
        personas[6] = staff3;
        personas[7] = staff4;

        int estudiantes=0, staff=0, cantidadRecaudada=0;
        for (int i=0; i<personas.length; i++){
            if (personas[i] instanceof Estudiante){
                cantidadRecaudada += ((Estudiante)personas[1]).getCuotaMensual();
                estudiantes++;
            }
            else
               staff++;
        }

        System.out.println("-------------------------------------");
        System.out.println("Cantidad de estudiantes: "+estudiantes);
        System.out.println("Cantidad de staff: "+staff);
        System.out.println("Cantidad de dinero recaudado: $"+cantidadRecaudada);
    }
}
