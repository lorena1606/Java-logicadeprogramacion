package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion(){
        String nombre = "Lorena ";
        int edad = 18;
        double estatura = 1.57;

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu estatura es: " + estatura);
    }   
    public static void demostrarConvencionesNombres(){
        String primerNombre = " Michell";
        int puntajeMaximo = 80;
        boolean esMayorDeEDad = true;

        System.out.println(" Tu primer nombre es: " + primerNombre);
        System.out.println("Tu puntaje maximo es: " + puntajeMaximo);
        System.out.println("Eres mayor de edad? " + esMayorDeEDad);
    }
    public static void demostrarConstantes(){
        final int DIAS_DEL_ANIO = 365;
        final double PI = 3.14159;

        System.out.println("Los dias del año son " +DIAS_DEL_ANIO);
        System.out.println("El numero pi es: " + PI);
    }
}
