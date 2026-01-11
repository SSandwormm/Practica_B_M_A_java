import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("Menu");
            System.out.println("1.ARREGLO NORMAL");
            System.out.println("2.ARREGLO 2X2");
            System.out.println("3.ARREGLO 3X3");
            System.out.println("4.PIRAMIDE ARREGLO");
            System.out.println("5.salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    Arreglo1();
                    break;
                case 2:
                    Arreglo2();
                    break;
                case 3:
                    Arreglo3();
                    break;
                case 4:
                    Arreglo4();
                    break;
                case 5:
                default:
            }

        } while (opc != 5);
        System.out.println("Adios");

    }

    public static void Arreglo1() {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("Ingrese los valores de la Matiz (Numeros):");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Elemento [" + i + "] : ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "\t");
        }

        System.out.println("\nLa suma de todos los elementos es: " + suma);
    }

    public static void Arreglo2() {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        int suma = 0;

        System.out.println("Ingrese los valores de la matriz 2x2:");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿ 0-0 ⣿ 0-1 ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿ 1-0 ⣿ 1-1 ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                suma += matriz[i][j];
            }
        }

        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nLa suma de todos los elementos es: " + suma);
    }

    public static void Arreglo3() {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int suma = 0;

        System.out.println("Ingrese los valores de la matriz 3x3:");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿ 0-0 ⣿ 0-1 ⣿ 0-2 ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿ 1-0 ⣿ 1-1 ⣿ 1-2 ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿ 2-0 ⣿ 2-1 ⣿ 2-2 ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
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

    public static void Arreglo4() {
        Scanner sc = new Scanner(System.in);
        int filas = 4;
        int[][] piramide = new int[filas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <= i; j++) {
                piramide[i][j] = i + 1;
            }
        }

        for (int i = 0; i < filas; i++) {

            for (int e = filas - i; e > 0; e--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(piramide[i][j] + " ");
            }

            System.out.println();
        }
    }


}