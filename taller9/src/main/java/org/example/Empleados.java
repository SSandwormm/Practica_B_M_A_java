package org.example;

import java.util.ArrayList;

public class Empleados {

    private String nombre;
    private String apellido;
    private int edad;
    private int id;
    private ArrayList<Integer> cuentas;

    public Empleados(int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }
    public void mostrar(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Apellido : " + apellido);
        System.out.println("Edad : " + edad);
        System.out.println("ID : " + id);
        System.out.println("Cuentas : " + cuentas);
        System.out.println("---------------------");
    }

    public void info (String nombreC){
        cuentas.add(Integer.valueOf(nombreC));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Integer> cuentas) {
        this.cuentas = cuentas;
    }
}
