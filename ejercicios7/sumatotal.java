package ejercicios7;

import java.util.Scanner;

public class sumatotal {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        double suma = 0;
        boolean continuar;

        do {
            System.out.print("Ingrese un número: ");
            numero = entrada.nextDouble();

            suma += numero;

            // Preguntar al usuario si desea ingresar otro número.
            System.out.print("¿Desea ingresar otro número? (si/no): ");
            String respuesta = entrada.next().toLowerCase();

            //  Determinar si se debe continuar el bucle.
            continuar = respuesta.equals("si");

        } while (continuar);

        //  Mostrar la suma de los números ingresados al finalizar el bucle.
        System.out.println("La suma de los números ingresados es: " + suma);

        entrada.close();
    }
}
