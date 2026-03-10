package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoBasicoExcepciones {
    // Maneja una ArithmeticException (ejemplo división por cero)
    public static void ejemploTryCatchDivision() {

        try {
            int numero1 = 10;
            int numero2 = 0;

            int resultado = numero1 / numero2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: no se puede dividir entre cero.");
        }
    }

    // Maneja InputMismatchException al usar Scanner
    public static void ejemploTryCatchInput() {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            System.out.println("Número ingresado: " + numero);

        } catch (InputMismatchException e) {

            System.out.println("Error: Debe ingresar un número entero válido.");
        }
    }

    // Demuestra el uso de finally
    public static void ejemploBloqueFinally() {

        try {

            int resultado = 10 / 2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error en la división.");

        } finally {

            System.out.println("Este bloque finally siempre se ejecuta.");
        }
    }

    // Evita que el programa se cierre por una excepción
    public static void evitarCierrePrograma() {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número para dividir 100: ");
            int numero = scanner.nextInt();

            int resultado = 100 / numero;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: División por cero.");

        } catch (InputMismatchException e) {

            System.out.println("Error: Debe ingresar un número válido.");
        }

        System.out.println("El programa continúa ejecutándose.");
    }
}
