package clasetrece;
//Clase numero 13 de Java! (Scanner en Java)

import java.util.Scanner;

public class Clasetrece {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner (System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el Titulo");
        var titulo = consola.nextLine();
        System.out.println("Resultado:" + titulo + " " + usuario);

    }

}
