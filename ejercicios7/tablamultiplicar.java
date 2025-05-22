package ejercicios7;

import java.util.Scanner;

public class tablamultiplicar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número natural para ver su tabla de multiplicar: ");
        int numero = entrada.nextInt();

        // Mostrar el encabezado de la tabla de multiplicar.
        System.out.println("Tabla de multiplicar del " + numero + ":");

        // Utilizar la estructura 'for' para generar y mostrar la tabla.
        for (int i = 1; i <= 10; i++) {
            // Calcular el resultado de la multiplicación.
            int resultado = numero * i;

            // Mostrar la línea de la tabla de multiplicar.
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        entrada.close();
    }
}
