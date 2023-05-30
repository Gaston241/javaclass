package claseveintiuno;

//Clase numero 21 de Java! (Conversion de tipos primitivos en java)

import java.util.Scanner;


public class Claseveintiuno {

    public static void main(String[] args) {
        //Convertir tipo strin a un tipo int
        var edad = Integer.parseInt("20");
       //var edad = "20";
        System.out.println("edad = " + (edad + 1 ));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir valor usando clase scanner
        
       var consola= new Scanner(System.in);
//        System.out.println("Dime tu edad = ");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("Tu edad es de " + edad + " años");
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
    }
    
}
