package ejercicios7;
import java.util.Scanner;

public class numeronaturales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //  Solicitar un número entero al usuario.
        System.out.print("Ingrese un número entero: ");
        int numeroLimite = entrada.nextInt();

        //  Inicializar el contador para los números pares.
        int contador = 0;

        // Mostrar los números naturales pares entre 0 y el número ingresado usando la estructura 'while'.
        System.out.println("Números naturales pares entre 0 y " + numeroLimite + ":");
        while (contador <= numeroLimite) {
            // Verificar si el contador es un número par.
            if (contador % 2 == 0) {
                System.out.print(contador + " ");
            }
            // Incrementar el contador para la siguiente iteración.
            contador++;
        }
        System.out.println(); 

        entrada.close();
    }
}