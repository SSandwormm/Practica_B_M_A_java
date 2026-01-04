package org.example;

import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private ArrayList<Integer> notas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public void agregar(int nota) {
        notas.add(nota);
    }

    public double calcular() {
        int suma = 0;
        for (int n : notas) {
            suma += n;
        }
        return (double) suma / notas.size();
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Notas: " + notas);
        System.out.println("Promedio: " + calcular());
        System.out.println("---------------------");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

}