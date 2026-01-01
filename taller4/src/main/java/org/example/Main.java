package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        ArrayList<Estudiante> lista= new ArrayList<Estudiante>();
        String nombre ,nombreMayor="";
        double cali,caliMayor =0 ;
        int n ;

        System.out.println("cuantos estudiantes decea ingresar");
        n=teclado.nextInt();

        for (int i=1;i <= n; i++){
            teclado.nextLine();
            System.out.println("nombre estudiante");
            nombre= teclado.nextLine();
            System.out.println("ingrese la  calificacion");
            cali= teclado.nextFloat();
            lista.add(new Estudiante(nombre,cali));
        }

        for (Estudiante j:lista){
            j.mostrar();
            if (j.getCali() >caliMayor){
                caliMayor = j.getCali();
                nombreMayor = j.getNombre();
            }
        }
        System.out.println(nombreMayor+ " tiene la calificaion mas alta : " + caliMayor);

    }
}