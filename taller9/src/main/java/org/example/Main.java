package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Empleados>empledos=new ArrayList<Empleados>();
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int valor = 0;

        do {
            System.out.println("_____________Menu__________________________");
            System.out.println("|                                          ");
            System.out.println("|      1.Ingreso Empleados               ");
            System.out.println("|      2.Mostrar Empleados                          ");
            System.out.println("|      3.                        ");
            System.out.println("|      4.                         ");
            System.out.println("|      5.Salir                             ");
            System.out.println("|__________________________________________");
            valor = teclado.nextInt();

            switch (valor) {
                case 1:
                    Agregar();
                    break;
                case 2:
                    mostrarI();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                default:
            }
        } while (valor != 5);
        {
            System.out.println("!Adios¡");
        }
    }

    public static void Agregar(){
        Scanner teclado= new Scanner(System.in);
        int cantidad=0;
        int cantidadC=0;

        System.out.println("cuantos empleados desea ingresar");
        cantidad = teclado.nextInt();

        for (int i=0; i< cantidad;i++){
            teclado.nextLine();
            System.out.println("Nombre "+(i+1)+" : ");
            String nombre=teclado.nextLine();
            System.out.println("Apellido "+(i+1)+" : ");
            String apellido=teclado.nextLine();
            System.out.println("Edad "+(i+1)+" : ");
            int edad=teclado.nextInt();
            System.out.println("Id "+(i+1)+" : ");
            int id=teclado.nextInt();

            Empleados inf =new Empleados(id);
            System.out.println("Cuntas cunetas tiene :");
            cantidadC= teclado.nextInt();;

            for (int j=0;j< cantidadC;j++){
                System.out.println("Nombre de la cunetas " +(j+1)+ " :");
                String nombreC =teclado.nextLine();
                inf.info(nombreC);
            }
            empledos.add(inf);
        }
    }

    public static void mostrarI(){

        mostrar();
//        if (empledos.isEmpty()){
//            System.out.println("No Hay empleados");
//            return;
//        }
//        for (Empleados e:empledos){
//
//        }
    }
}