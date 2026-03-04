package com.example;

public class Operadores {
    public static void demostrarAritmeticos(){
        int a = 12;
        int b = 8;

        System.out.println("La suma de a y b es:" +(a + b));
        System.out.println("La resta de a y b es:" +(a - b));
        System.out.println("La division de a y b es:" +(a / b));
         System.out.println("La multiplicacion de a y b es:" +(a * b));

    }
    public static void demostrarIncrementoDecremento(){
        int i = 4;

        System.out.println("incremento(imprime el numero y luego le suma 1 ): " + (i++));
        System.out.println("incremento (suma antes y luego muestra el resultado " + (++i));
        System.out.println("decremento(ve el numero y este le va restar 1) " + ( --i));
        System.out.println("decremento (imprimere primero el numero y lo muestra luego le resta 1)" + ( i--));

    }
    public static void demostrarRelacionales(){
        int x = 10;
        int y = 20;

        System.out.println("(x > y) : " + (x > y ));
        System.out.println("(x >= y): " + (x >= y ));
        System.out.println("(x < y): " + (x < y ));
        System.out.println("(x <= y): " + (x <= y ));
        System.out.println("(x ==  y): " + (x == y ));
        System.out.println("(x !=  y): " + (x != y ));

    }
    public static void demostrarLogicos(){
        boolean tieneLicencia = false;
        boolean esMayorEdad = true;

        System.out.println("es mayor de edad y tiene licencia? " + (tieneLicencia && esMayorEdad));
        System.out.println("es mayor de edad o tiene licencia? " + (tieneLicencia || esMayorEdad));
        System.out.println("No tiene licencia? " + ( !tieneLicencia ));
    }
    public static void demostrarAsignacionCompuesta(){
        int numeroo = 10;
        numeroo += 5;
        System.out.println(" += 5" + numeroo);
        numeroo -= 3;
        System.out.println(" -= 3" + numeroo);
        numeroo *= 2;
        System.out.println(" *= 2" + numeroo);
        numeroo /= 1;
        System.out.println(" /= 1" + numeroo);
        numeroo %= 4;
        System.out.println(" %= 4" + numeroo);    
    }
    public static void demostrarOperadorTernario(){
        int edad = 18;

        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("Resultado: " + resultado);
    }
} 
