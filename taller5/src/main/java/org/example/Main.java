package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        ArrayList<usuarios> lista = new ArrayList<usuarios>();

        String usuario;
        String contrasena;
        int opc = 0;

        do {
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ *GOAT* ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ BIENVENIDO ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ 1.Ingreso ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ 2.Registro ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ 3.Salir  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠠⠴⠶⠾⠿⠿⠿⢶⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢿⣿⣆⠐⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⠿⠆⠹⠦⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣤⣤⣤⣀⠐⣶⣶⣶⣶⣶⣶⡀⢀⣀⣀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⢿⣿⡆⢹⡿⠻⢿⣿⣿⣷⠈⠿⠛⠁⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣴⣾⣷⣤⣉⣠⣾⣷⣦⣼⣿⣿⣿⣧⠀⠀⠀⠀⠀");
            System.out.println("⠀⣶⣶⣶⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀");
            System.out.println("⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀");
            System.out.println("⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣛⠻⢧⣘⡷⠀⠀⠀");
            System.out.println("⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⣉⠛⠿⣷⣦⣌⠁⠀⠀⠀");
            System.out.println("⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣠⠘⠀⠀⢹⣿⣶⣶⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⢺⣿⠀⠀⠀⠘⣿⣿⡟⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠁⠀⠀⠀⠀⠻⡟⠃⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠛⠛⠛⠛⠛⠛⠛⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");

            opc = teclado.nextInt();


            String valor;
            int intentos = 0;


            switch (opc) {

                case 1:
                    do {

                        teclado.nextLine();
                        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                        System.out.println("⣿⣿⣿⣿⣿⣿⣿ Login GOAT ⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                        System.out.println("________Ingrese usuario________");
                        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                        String u = teclado.nextLine();
                        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                        System.out.println("_______Ingrese contraseña______");
                        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                        String c = teclado.nextLine();

                        for (usuarios us : lista) {
                            if (us.getUsuario().equalsIgnoreCase(u)
                                    && us.getContrasena().equals(c)) {

                                System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                                System.out.println(".......... BIENVENIDO .........");
                                System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                                AsciiArt.mostrarAscii();

                                System.out.println("Envia un menaje a GOAT");
                                String Mensaje = teclado.nextLine();


                            }
                        }
                        System.out.println("usuario o contraseña inccorrecta");
                        intentos++;


                    } while (intentos != 3);{
                    System.out.println("fin de intentos");
                }
                break;
                case 2:
                    teclado.nextLine();
                    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                    System.out.println("⣿⣿⣿⣿⣿⣿ Registro GOAT ⣿⣿⣿⣿⣿⣿⣿");
                    System.out.println("________Ingrese usuario________");
                    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                    usuario =teclado.nextLine();

                    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                    System.out.println("_______Ingrese contraseña______");
                    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                    contrasena = teclado.nextLine();
                    lista.add(new usuarios(usuario,contrasena));

                    for (usuarios j:lista){

                        j.mostrar();
                    }

                    break;
                case 3:
                    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ *GOAT* ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ ADIOS ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠠⠴⠶⠾⠿⠿⠿⢶⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢿⣿⣆⠐⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⠿⠆⠹⠦⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣤⣤⣤⣀⠐⣶⣶⣶⣶⣶⣶⡀⢀⣀⣀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⢿⣿⡆⢹⡿⠻⢿⣿⣿⣷⠈⠿⠛⠁⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣴⣾⣷⣤⣉⣠⣾⣷⣦⣼⣿⣿⣿⣧⠀⠀⠀⠀⠀");
                    System.out.println("⠀⣶⣶⣶⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀");
                    System.out.println("⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀");
                    System.out.println("⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣛⠻⢧⣘⡷⠀⠀ADIOS⠀");
                    System.out.println("⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⣉⠛⠿⣷⣦⣌⠁⠀⠀⠀");
                    System.out.println("⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣠⠘⠀⠀⢹⣿⣶⣶⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⢺⣿⠀⠀⠀⠘⣿⣿⡟⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠁⠀⠀⠀⠀⠻⡟⠃⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠛⠛⠛⠛⠛⠛⠛⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                default:

            }
        } while (opc != 3);
        {
            System.out.println("!Adios¡");
        }

    }

    public class AsciiArt {

        private static final String ASCII = """
⠀⠀⠀⠀⠀      ⢀⣤⠶⣾⡻⣯⣹⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀    ⣤⠖⠋⢿⣩⣿⣳⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠉⠀⠀⣀⣙⣿⣷⡞⣀⠀⠹⡄⠀⠀⠀⠀⠀⠀  ⢀⡾⠁⢀⠛⣶⣿⣋⣁⡀⠀⠈⠓⢦⡀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⢤⣤⣤⡴⢋⣁⣠⠴⠒⠋⠁⠀⠈⠙⢿⣉⣀⡀⢻⡀⠀⠀⠀⠀⠀⡼⠁⣀⣈⣹⠏⠉⠀⠈⠉⠓⠲⢤⣀⡙⠲⣤⣤⣤⠀⠀⠀
⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠘⣏⣠⣄⣀⣧⠀⠀⠀⠀⢰⣇⣀⣀⣈⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⢿⡤⠤⣄⣽⡄⠀⠀⠀⣾⣀⡥⢤⣹⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⢸⣥⠦⣄⣀⡇⠀⠀⢠⣇⣀⡤⢤⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠈⣧⠤⣀⢀⣿⠀⠀⢸⡅⣀⡤⢴⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⠤⠬⢭⣸⡆⠀⣿⣩⠥⠤⣼⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠴⠖⣶⠶⠿⣦⣀⠀⠈⠙⠚⠉⠀⢀⣤⠾⠷⢶⡶⠦⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⣠⠶⠖⠶⢤⣶⣋⠁⠀⠀⢸⡇⠀⠀⠈⢻⡓⠦⠤⠤⠤⠖⡿⠁⠀⠀⠀⡷⠀⠀⠀⢉⣳⣦⠴⠖⠶⢤⡀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⣿⡀⠀⠀⣾⣉⣉⣙⣶⠶⣶⣷⡶⢦⡀⠀⢳⡀⠀⠀⠀⣸⠁⠀⣠⢶⣾⣷⡶⢶⣚⣉⣈⣹⠆⠀⠀⣸⡇⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠙⠲⠤⣄⣩⣭⠤⠶⠚⠉⢻⣿ ⣷⣷⡀⠸⡇⠀⠀⠀⡇⠀⣼⣿ ⡿⠋⠙⠲⠤⣬⣭⣤⡤⠴⠚⠉⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟⠛⠿⡇⠀⡇⠀⠀⠀⡇⢀⡿⠟⢻⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡀⠀⣧⢠⡇⠀⠀⠀⡇⢸⠇⠀⣸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⡀⢿⣼⠀⠀⠀⠀⢻⣼⠀⣼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢷⢈⡇⣤⠀⠀⢠⠈⡇⢸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⢀⣧⠀⠀⣸⡇⣷⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡀⠛⠷⠴⠟⠁⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡷⣄⡀⠀⣀⣴⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠻⣤⣉⣉⣥⠾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⢹⣏⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⢸⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⢿⡾⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀""";

        public static void mostrarAscii() {
            System.out.print(ASCII);
        }
    }
}