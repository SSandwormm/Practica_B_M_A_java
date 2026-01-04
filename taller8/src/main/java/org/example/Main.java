package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int valor = 0;

        do {
            System.out.println("_____________Menu__________________________");
            System.out.println("|                                          ");
            System.out.println("|      1.Ingreso estudiantes               ");
            System.out.println("|      2.Notas                             ");
            System.out.println("|      3.Promedios                         ");
            System.out.println("|      4.Paso o Perdio                         ");
            System.out.println("|      5.Salir                             ");
            System.out.println("|__________________________________________");
            valor = teclado.nextInt();

            switch (valor) {
                case 1:
                    agregar();
                    break;
                case 2:
                    notas();
                    break;
                case 3:
                    promedio();
                    break;
                case 4:
                    paso();
                    break;
                case 5:
                default:
            }
        } while (valor != 5);
        {
            System.out.println("!Adios¡");
        }

    }

    public static void agregar() {
        Scanner teclado = new Scanner(System.in);
        int cantida = 0;

        System.out.println("Cuantos Estudiantes Desea Ingresar ");
        cantida = teclado.nextInt();

        for (int i = 0; i < cantida; i++) {
            System.out.println("Nombre del  Estudiantes ");
            teclado.nextLine();
            String nombre = teclado.nextLine();

            Estudiante est = new Estudiante(nombre);

            System.out.println("Cuantas Notas Desea Ingresar");
            int cantidadN = teclado.nextInt();
            for (int j = 0; j < cantidadN; j++) {
                System.out.println("Nota " + (j + 1) + " :");
                int nota = teclado.nextInt();
                est.agregar(nota);
            }
            estudiantes.add(est);
        }

    }

    public static void notas() {
        if (estudiantes.isEmpty()) {
            System.out.println("No Hay Estudiantes");
            return;
        }
        for (Estudiante e : estudiantes) {
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Notas: " + e.getNotas());
            System.out.println("---------------------");
        }
    }

    public static void promedio() {
        if (estudiantes.isEmpty()) {
            System.out.println("No Hay Estudiantes");
            return;
        }
        for (Estudiante e : estudiantes) {
            System.out.println("Promedio de " + e.getNombre() + ": " + e.calcular());
        }
    }

    public static void paso(){

        if (estudiantes.isEmpty()) {
            System.out.println("No Hay Estudiantes");
            return;
        }
        for (Estudiante e : estudiantes) {
            if (e.calcular() >= 3) {
                System.out.println("--------PASO---------");
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Notas: " + e.getNotas());
                System.out.println("Notas: " + e.calcular());
                System.out.println("---------------------");
            } else {
                System.out.println("--------PERDIO---------");
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Notas: " + e.getNotas());
                System.out.println("Notas: " + e.calcular());
                System.out.println("---------------------");
            }
        }
    }

}


