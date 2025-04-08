package com.calc;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Abrimos Scanner
        Scanner teclado = new Scanner(System.in);

        // Declaramos variables
        int num1, num2;

        // Le pedimos al usuario que introduzca dos números
        System.out.println("Introudce dos números :");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();

        // Declaramos un objeto de la clase Calculadora
        Calculadora c1 = new Calculadora(num1, num2);

        // Realizamos una suma y una resta con los números introducidos por el usuario y lo mostramos
        System.out.println("La suma de los dos números es: " + c1.suma());
        System.out.println("La resta del segúndo número menos el primero1 es: " + c1.resta());

        teclado.close();
    }
}
