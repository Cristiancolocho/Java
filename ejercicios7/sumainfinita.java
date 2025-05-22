package ejercicios7;

import java.util.Scanner;

public class sumainfinita {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el primer número: ");
            double numero1 = entrada.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double numero2 = entrada.nextDouble();

            double suma = numero1 + numero2;

            System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

            //Preguntar al usuario si desea realizar otra suma.
            System.out.print("¿Desea realizar otra suma? (si/no): ");
            String respuesta = entrada.next().toLowerCase();

            // Verificar la respuesta del usuario para continuar o detener el programa.
            if (!respuesta.equals("si")) {
                continuar = false;
                System.out.println("Programa terminado.");
            }
        }

        // 7. Cerrar el objeto Scanner.
        entrada.close();
    }
}
