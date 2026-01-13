package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int suma = 0;

        System.out.println("Ingrese los valores de la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
                suma += matriz[i][j];
            }
        }

        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nLa suma de todos los elementos es: " + suma);
    }
}
