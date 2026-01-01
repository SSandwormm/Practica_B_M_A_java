package org.example;

public class usuarios {

    private String usuario;
    private String  contrasena;

    public usuarios(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void mostrar(){
        System.out.println("Usuario : "+usuario + "Contrasena : "+contrasena);
    }
}
