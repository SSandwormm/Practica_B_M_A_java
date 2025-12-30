package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado4 = new Scanner(System.in);
        int valor = 0;

        do {
            System.out.println("_____________Menu_____________________");
            System.out.println("|                                         ");
            System.out.println("|      1.Sumar 2 numeros                ");
            System.out.println("|      2.Restar 2 numeros               ");
            System.out.println("|      3.Multiplicar 2 numeros               ");
            System.out.println("|      4.Dividir 2 numeros               ");
            System.out.println("|      5.Salir              ");
            System.out.println("|__________________________________________");
            valor= teclado4.nextInt();

            switch (valor){
                case 1:
                    System.out.println("ingrese primer numero");
                    int numero1s = teclado4.nextInt();
                    System.out.println("ingrese segundo numero");
                    int numero2s = teclado4.nextInt();
                     int resultados = numero1s +numero2s;
                    System.out.println("Resultado"+""+resultados);

                    break;
                case 2:
                    System.out.println("ingrese primer numero");
                    int numero1r = teclado4.nextInt();
                    System.out.println("ingrese segundo numero");
                    int numero2r = teclado4.nextInt();
                    int resultador = numero1r -numero2r;
                    System.out.println("Resultado"+""+resultador);

                    break;
                case 3:
                    System.out.println("ingrese primer numero");
                    int numero1m = teclado4.nextInt();
                    System.out.println("ingrese segundo numero");
                    int numero2m = teclado4.nextInt();
                    int resultadom = numero1m *numero2m;
                    System.out.println("Resultado"+""+resultadom);
                    break;
                case 4:
                    System.out.println("ingrese primer numero");
                    int numero1d = teclado4.nextInt();
                    System.out.println("ingrese segundo numero");
                    int numero2d = teclado4.nextInt();
                    int resultadod = numero1d / numero1d;
                    System.out.println("Resultado"+""+resultadod);

                    break;
                case 5:
                default:
            }
        }while (valor != 5);{
            System.out.println("!Adios¡");
        }

    }
}