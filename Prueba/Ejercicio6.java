/*6.Desarrollar un programa que solicite un número entero cualquiera
 y como resultado muestra si el número
es positivo, negativo o neutro. */
package Prueba;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args)
{
    Scanner entrada = new Scanner(System.in);

    System.out.print("Ingrese un número entero cualquiera: ");

    int numero = entrada.nextInt();

    String clasificacion;
        if (numero > 0) {
            clasificacion = "positivo";
        } else if (numero < 0) {
            clasificacion = "negativo";
        } else {
            clasificacion = "neutro"; 
        }
       
    System.out.println("El número " + numero + " es " + clasificacion + ".");

    entrada.close();
}
}
