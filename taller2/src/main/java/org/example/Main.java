package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         /*   ===== MENÚ =====__________________________________________
        1. Registrar estudiante
        2. Calcular promedio
        3. Mostrar estado
        4. Salir
🔹 Reglas del programa
        1️⃣ Registrar estudiante
        Pedir:
        Nombre del estudiante
        Cantidad de notas
        Notas (validar entre 0 y 5)
        Guardar las notas en una List<Double>
         2️⃣ Calcular promedio
        Calcular el promedio de las notas ingresadas
        Mostrar el promedio con 2 decimales
        Si no hay notas, mostrar un mensaje de advertencia
        3️⃣ Mostrar estado
        Según el promedio:
⭐ Excelente → ≥ 4.5
✅ Aprobado → ≥ 3.0
❌ Reprobado → < 3.0
        Mostrar:
        Nombre
        Notas
        Promedio
        Estado
        4️⃣ Salir
        Finaliza el programa correctamente
        ________________________________________________________________*/



        Scanner teclado3 = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        double sumanotas = 0;
        double notafinal = 0;
        String nombree = "";
        double N_notas = 0;
        int valor;

        do {

            System.out.println("_________________MENU_____________________");
            System.out.println("|                                         ");
            System.out.println("|      1.Registar estudiantes             ");
            System.out.println("|      2.Calcular notas                   ");
            System.out.println("|      3.Mostar Estado                    ");
            System.out.println("|      4.Salir                            ");
            System.out.println("|__________________________________________");

            valor = teclado3.nextInt();
            switch (valor) {
                case 1:
                    System.out.println("nombre estudiante ");
                    nombree = teclado3.next();


                    System.out.println("Cuantas notas desea ingresar");
                    N_notas = teclado3.nextInt();

                    for (int i = 0; i < N_notas; i++) {
                        while (true) {
                            System.out.println("ingrese nota" + ":" + (i + 1) + " " + "(0.0 a 5.0)");
                            double nota = teclado3.nextDouble();
                            if (nota >= 0.0 && nota <= 5.0) {
                                System.out.println("nota Aceptada" + ": " + nota);
                                notas.add(nota);
                                break;
                            } else {
                                System.out.println("nota Invalida " + ": " + nota);

                            }
                        }
                    }
                    break;
                case 2:
                    if (notas.isEmpty()) {
                        System.out.println("no hay notas");
                    } else {
                        System.out.println(notas);
                        for (double nota : notas) {
                            sumanotas += nota;
                        }
                        notafinal = sumanotas / N_notas;
                        System.out.println("nota final" + " " + String.format("%.2f", notafinal));
                    }
                    break;
                case 3:

                    notafinal = sumanotas / N_notas;
                    if (notafinal >= 4.5) {
                        System.out.println("_____________NOTA EXCELENTE________________");
                        System.out.println("|                                          ");
                        System.out.println("|      1.Nombre:" + nombree + "                 ");
                        System.out.println("|      2.Notas:" + notas + "                   ");
                        System.out.println("|      3.Nota Final:" + " " + String.format("%.2f", notafinal));
                        System.out.println("|__________________________________________");

                    } else if (notafinal >= 3.0) {
                        System.out.println("_____________NOTA BUENA____________________");
                        System.out.println("|                                          ");
                        System.out.println("|      1.Nombre:" + nombree + "                 ");
                        System.out.println("|      2.Notas:" + notas + "                   ");
                        System.out.println("|      3.Nota Final:" + " " + String.format("%.2f", notafinal));
                        System.out.println("|__________________________________________");

                    } else {
                        System.out.println("_____________NOTA BAJA_____________________");
                        System.out.println("|                                         ");
                        System.out.println("|      1.Nombre:" + nombree + "                ");
                        System.out.println("|      2.Notas:" + notas + "                  ");
                        System.out.println("|      3.Nota Final:" + " " + String.format("%.2f", notafinal));
                        System.out.println("|__________________________________________");
                    }

                    break;
                case 4:
                default:
            }

        } while (valor != 4);{
            System.out.println("Fin");

        }

    }
}