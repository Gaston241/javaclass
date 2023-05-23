package clasequince;

//Clase numero 15 y 16 de Java! (Tipos primitivos de java y Tipos Numericos Enteros!)
public class Clasequince {

    public static void main(String[] args) {
        /*
        Tipos primitivos enteros: byte, short, int, long.
        */
        
        byte numeroByte = (byte)129;
        System.out.println("Valor byte: "+ numeroByte);
        System.out.println("valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte:" + Byte.MAX_VALUE);
        
        short numeroShort = (short)32768;
        System.out.println("Numero short:" + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt: " + numeroInt);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("Numero long: " + numeroLong);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        
    }

}
