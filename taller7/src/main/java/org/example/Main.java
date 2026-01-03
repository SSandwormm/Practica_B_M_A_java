package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Estudiante> estudiantes= new ArrayList<Estudiante>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;

        do {
            System.out.println("MENU\n" +
                    "1.Agregar estudiante\n" +
                    "\n" +
                    "2.Mostrar estudiantes\n" +
                    "\n" +
                    "3.Promedio de notas\n" +
                    "\n" +
                    "4.Salir" +
                    "\n");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    agregar();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    promedio();
                    break;
                case 4:
                default:
            }
        } while (opc != 4);
        System.out.println("!ADIOS");
    }

    public static void agregar() {
        Scanner teclado = new Scanner(System.in);
        estudiantes.clear();
        int cantidadA= 0;
        int cantidadN= 0;
        String nombre;
        int nota;

        System.out.println("Cuantos Estudiantes Desea Ingresar ");
        cantidadA = teclado.nextInt();

        for (int i = 0; i < cantidadA; i++) {
            teclado.nextLine();
            System.out.println("nombre : " + (i + 1));
            nombre = teclado.nextLine();
            System.out.println("notas : " + (i+ 1));
            nota = teclado.nextInt();
            estudiantes.add(new Estudiante(nombre, nota));

        }
    };

    public static void mostrar(){
        if (estudiantes.isEmpty()) {
            System.out.println("no hay estudiantes guardados");
        }else {
            for (Estudiante j : estudiantes) {
                j.mostar();
            }
        }
    };

    public static void promedio(){
        if (estudiantes.isEmpty()) {
            System.out.println("no hay estudiantes guardados");
        }else {
            for (Estudiante j : estudiantes) {
                if (j.getNota() >= 3){
                    System.out.println(j.getNombre()+ " PASO SEMESTRE");
                }else {
                    System.out.println(j.getNombre()+ " PERDIO SEMESTRE");
                }
            }
        }

    }
}