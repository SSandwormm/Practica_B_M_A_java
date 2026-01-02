package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList <Integer> numeros= new ArrayList<>();


    public static void main(String[] args) {
// ejecico de  + - * /  y salir usasndo metodos
        Scanner teclado = new Scanner(System.in);
        int opc=0;
        do {
            System.out.println("Menu");
            System.out.println("1.suma");
            System.out.println("2.resta");
            System.out.println("3.multiplicacion");
            System.out.println("4.divicion");
            System.out.println("5.salir");
            opc=teclado.nextInt();
            switch (opc) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    multiplicacion();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                default:
            }

        } while (opc != 5);
            System.out.println("Adios");

    }

    public static void suma(){
        Scanner teclado = new Scanner(System.in);
        numeros.clear();

        System.out.println("cuantos numero quiere sumar");
        int cantidad = teclado.nextInt();

        for(int i =0; i < cantidad; i++){
            System.out.println("Numero : "+ (i+1));
            int numero= teclado.nextInt();
             numeros.add(numero);
        }
        int suma =0;
        for (int numero : numeros){
            suma += numero;
        }
        System.out.println(" la suma es : "+suma);
    };

     public  static void resta(){
         Scanner teclado = new Scanner(System.in);
         numeros.clear();

         System.out.println("cuantos nuemros quiere restar");
         int cantidad = teclado.nextInt();

         for (int i =0; i < cantidad ; i ++){
             System.out.println("Numero : "+(i+1));
             int numero=teclado.nextInt();
             numeros.add(numero);
         }
         int resta =0;
         for (int numero: numeros){
             resta -= numero;
         }
         System.out.println("la resta es : "+resta);
     };

     public static void multiplicacion(){
         Scanner teclado = new Scanner(System.in);
         numeros.clear();

         System.out.println("cuantos numeros quiere multiplicar");
         int cantidad = teclado.nextInt();

         for (int i=0; i < cantidad;i++){
             System.out.println("Numero :" + (i+1));
             int numero=teclado.nextInt();
             numeros.add(numero);
         }
         int multiplicacion =1;
         for (int numero: numeros){
             multiplicacion *= numero;
         }
         System.out.println("la multiplicacion : "+ multiplicacion);
     };

     public static void dividir(){
         Scanner teclado = new Scanner(System.in);
         numeros.clear();

         System.out.println("cuantos numeros quiere dividir ");
         int cantidad = teclado.nextInt();

         for (int i =0; i <cantidad;i++){
             System.out.println("Numero : " +(i+1));
             int numero=teclado.nextInt();
             numeros.add(numero);
         }
         int divicion= numeros.get(0);

         for (int i =1; i< numeros.size();i++){

             if (numeros.get(i) == 0) {
                 System.out.println("no se puede dividir entre 0");
                 return;
             }
             divicion /= numeros.get(i);
         }
         System.out.println("la divicion : "+ divicion);

     }
}