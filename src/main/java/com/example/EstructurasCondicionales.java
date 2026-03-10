package com.example;

public class EstructurasCondicionales {
    // Ejemplo simple de if
    public static void ejemploIf() {
        int edad = 20;

        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        }
    }

    // Ejemplo de if - else
    public static void ejemploIfElse() {
        int numero = 5;

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    // Ejemplo de if - else if - else
    public static void ejemploIfElseIfElse() {
        int nota = 75;

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

    // Ejemplo de switch tradicional
    public static void ejemploSwitch() {
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miércoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            default:
                System.out.println("Fin de semana");
        }
    }

    // Ejemplo de switch expression (Java 14+)
    public static void ejemploSwitchExpression() {
        int dia = 2;

        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            default -> "Fin de semana";
        };

        System.out.println("Hoy es: " + nombreDia);
    }
}

