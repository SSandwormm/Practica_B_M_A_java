package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*EJERCICIO BÁSICO EN JAVA____________________
Sistema simple de calificaciones
📌 Enunciado
Crea un programa en Java que haga lo siguiente:
Pida al usuario su nombre.
Pida 3 notas (valores entre 0 y 5).
Calcule el promedio de las notas.
Muestre:
El nombre del estudiante
El promedio
Un mensaje según el promedio:
Aprobado → promedio ≥ 3.0
Reprobado → promedio < 3.0
___________________________________________________*/


        String nombre ;
        double nota1 ;
        double nota2 ;
        double nota3;
        int promedio = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese su nombre");
        nombre = teclado.nextLine();

        System.out.println("ingres su nota 1");
        nota1 = teclado.nextDouble();
        System.out.println("ingres su nota 2");
        nota2 = teclado.nextDouble();
        System.out.println("ingres su nota 3");
        nota3 = teclado.nextDouble();


        double  nota_final = ((nota1+nota2+nota3)/3);


        if (promedio >= 3){
            System.out.println(nombre);
            System.out.println("Aprobado"+" "+String.format("%.2f",nota_final));
        }else {
            System.out.println(nombre);
            System.out.println("Reprobado"+" "+String.format("%.2f",nota_final));

        }


        /*Reto extra (opcional)_________________________________*
Si quieres subir un poco el nivel:
Validar que las notas estén entre 0 y 5
Permitir ingresar N notas usando un for
Mostrar si el estudiante quedó:
Excelente (≥ 4.5)
Bueno (≥ 3.0)
Bajo (< 3.0)
_______________________________________________________________*/


        Scanner teclado2 = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        int N_notas;
        double notaFinal = 0;

        System.out.println("ingrese su nombre");
        String nombre2= teclado2.nextLine();
        System.out.println("Cuantas notas desea ingresar");
        N_notas = teclado2.nextInt();

        for (int i =0; i< N_notas; i++){

            while (true){
                System.out.println("ingrese nota"+ ":"+(i+1) +" "+ "(0.0 a 5.0)");
                double nota = teclado2.nextDouble();
                if (nota >= 0.0 && nota <=5.0){
                    System.out.println("nota Aceptada" + ": "+nota);
                    notas.add(nota);
                    break;
                }else {
                    System.out.println("nota Invalida "+ ": "+nota);

                }
            }
        }
        for (double nota : notas){
            notaFinal += nota;

        }
        double notaCorte  = notaFinal/N_notas;

        if (notaCorte >= 4.5){
            System.out.println("_____________NOTA EXCELENTE________________");
            System.out.println("|                                          ");
            System.out.println("|      1.Nombre:"+nombre2+"                 ");
            System.out.println("|      2.Notas:"+notas+"                   ");
            System.out.println("|      3.Nota Final:"+" "+String.format("%.2f",notaCorte));
            System.out.println("|__________________________________________");

        } else if (notaCorte >= 3.0) {
            System.out.println("_____________NOTA BUENA____________________");
            System.out.println("|                                          ");
            System.out.println("|      1.Nombre:"+nombre2+"                 ");
            System.out.println("|      2.Notas:"+notas+"                   ");
            System.out.println("|      3.Nota Final:"+" "+String.format("%.2f",notaCorte));
            System.out.println("|__________________________________________");

        }else {
            System.out.println("_____________NOTA BAJA_____________________");
            System.out.println("|                                         ");
            System.out.println("|      1.Nombre:"+nombre2+"                ");
            System.out.println("|      2.Notas:"+notas+"                  ");
            System.out.println("|      3.Nota Final:"+" "+String.format("%.2f",notaCorte));
            System.out.println("|__________________________________________");
        }



    }

}