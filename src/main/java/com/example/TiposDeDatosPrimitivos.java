package com.example;

public class TiposDeDatosPrimitivos {
    public static void demostarEnteros()
    {
        byte rangoByte = 10;
        short rangoShort = 200;
        int rangoInt = 12;
        long rangoLong = 100L;

        System.out.println("Byte: " + rangoByte);
        System.out.println("Short: " + rangoShort);
        System.out.println("Int: " + rangoInt);
        System.out.println("Long: " + rangoLong);
    }
    public static void demostrarFlotantes(){
        float numeroFLoat = 2.43f;
        double numeroDouble = 12.345;
        
        System.out.println("Este es un ejemplo de un numero Float: " +numeroFLoat);
        System.out.println("Este es un ejemplo de un numero Double: " +numeroDouble);


    }
    public static void demostrarCaracter(){
        char letra = 'L'; 

        System.out.println("La letra es: " + letra);
    }
    public static void demostarBooleanos() {
        boolean mayorDeEdad = true;

        System.out.println("La persona es mayor de edad? :" + mayorDeEdad);
    }
    public static void demostarValoresPorDefecto(){
        // Los valores por defecto SOLO aplican a variables de instancia o de clase,
        // NO a variables locales. Por eso aquí solo lo explicamos.

        /*
         * byte -> 0
         * short -> 0
         * int -> 0
         * long -> 0L
         * float -> 0.0f
         * double -> 0.0
         * char -> '\u0000'
         * boolean -> false
         */
        System.out.println("Los valores por defecto se explican en comentarios.");
    }
}
