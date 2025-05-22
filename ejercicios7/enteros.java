package ejercicios7;

import java.util.Scanner;

public class enteros {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar el primer número entero al usuario.
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = entrada.nextInt();

        // Solicitar el segundo número entero al usuario.
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = entrada.nextInt();

        // Determinar el rango para iterar.
        int inicio;
        int fin;

        if (numero1 < numero2) {
            inicio = numero1;
            fin = numero2;
        } else {
            inicio = numero2;
            fin = numero1;
        }

        // Inicializar el contador al valor de inicio.
        int contador = inicio;

        //Mostrar los números pares entre los dos números ingresados usando la estructura 'while'.
        System.out.println("Números pares entre " + inicio + " y " + fin + ":");
        while (contador <= fin) {
            // Verificar si el contador es un número par.
            if (contador % 2 == 0) {
                // Evitar mostrar el número inicial si también es par y el bucle empieza ahí.
                if (contador != inicio || (inicio % 2 == 0)) {
                    System.out.print(contador + " ");
                } else if (inicio == fin && inicio % 2 == 0) {
                    System.out.print(contador + " ");
                } else if (inicio != fin && contador != inicio) {
                    System.out.print(contador + " ");
                }
            }
            // Incrementar el contador para la siguiente iteración.
            contador++;
        }
        System.out.println();

        entrada.close();
    }
}
