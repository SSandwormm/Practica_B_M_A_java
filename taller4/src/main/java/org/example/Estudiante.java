package org.example;

public class Estudiante {

    private String nombre;
    private double cali;

    public Estudiante(String nombre, double cali) {
        this.nombre = nombre;
        this.cali = cali;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCali() {
        return cali;
    }



    public void mostrar() {
        System.out.println("Estudinates:"+nombre+" Calificaicon : "+cali);
    }

}