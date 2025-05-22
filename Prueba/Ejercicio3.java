package Prueba;

/*Ejercicio 3 Desarrollar un programa que solicite un número entero positivo y como
resultado muestre todos los números impares entre 0 y el número ingresado.
Utilizar la
 */

import java.util.Scanner;

public class Ejercicio3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numeroIngresado = scanner.nextInt();

        if (numeroIngresado <= 0) {
            System.out.println("Por favor, ingresa un número entero positivo.");
        } else {
            System.out.println("Números impares entre 0 y " + numeroIngresado + ":");
            for (int i = 1; i <= numeroIngresado; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
