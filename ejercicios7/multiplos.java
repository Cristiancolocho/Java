package ejercicios7;

public class multiplos {
     public static void main(String[] args) {
        // Definir la cantidad de múltiplos a mostrar.
        int cantidadMultiplos = 50;

        // Definir el número base del que queremos los múltiplos.
        int numeroBase = 5;

        // Utilizar la estructura 'for' para generar y mostrar los múltiplos.
        System.out.println("Los primeros " + cantidadMultiplos + " múltiplos de " + numeroBase + " son:");
        for (int i = 1; i <= cantidadMultiplos; i++) {
            // Calcular el múltiplo actual.
            int multiplo = numeroBase * i;

            // Mostrar el múltiplo.
            System.out.print(multiplo + " ");

            // Formatear la salida para que no quede en una sola línea larga (opcional).
            if (i % 10 == 0) {
                System.out.println(); // Salto de línea cada 10 múltiplos.
            }
        }
        System.out.println();
    }
}
