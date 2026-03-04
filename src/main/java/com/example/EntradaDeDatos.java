package com.example;
import java.util.Scanner;

public class EntradaDeDatos {
    public static void leerVariosTipos(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero entero: ");
        int numeroEnt = scanner.nextInt();

        System.out.println("ingrese un numero decimal: ");
        double numeroDou = scanner.nextDouble();

        System.out.println("ingrese una sola palabra : ");
        String palabra = scanner.next();

        System.out.println("ingrese una frase completa: ");
        String frase = scanner.next();

        System.out.println("Numero entero ingresado: " + numeroEnt);
        System.out.println("Numero decimal ingresado: " + numeroDou);
        System.out.println("La palabra ingresada es: " + palabra);
        System.out.println("La frase ingresada es : " + frase);

    }
    public static void manejarSaltoDeLineaPendiente(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad (int): ");
        int edadd = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ingrese su nombre completo: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Resultado: Hola " + nombre + ", tienes " + edadd + "años");
    }
}
