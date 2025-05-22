package ejercicios7;

import java.util.Scanner;

public class descuentoproductos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: $");
        double valorCompra = entrada.nextDouble();

        // Solicitar el color de la etiqueta del descuento.
        System.out.print("Ingrese el color de la etiqueta del descuento (verde, roja, azul o dorada): ");
        String colorEtiqueta = entrada.next().toLowerCase(); // Convertir a minúsculas para comparar

        double descuentoPorcentaje = 0;

        // Determinar el porcentaje de descuento según el color de la etiqueta.
        switch (colorEtiqueta) {
            case "verde":
                descuentoPorcentaje = 0.05; // 5%
                break;
            case "roja":
                descuentoPorcentaje = 0.10; // 10%
                break;
            case "azul":
                descuentoPorcentaje = 0.15; // 15%
                break;
            case "dorada":
                descuentoPorcentaje = 0.20; // 20%
                break;
            default:
                System.out.println("Etiqueta no válida. No se aplicará descuento.");
                descuentoPorcentaje = 0;
                break;
        }

        // Calcular el monto del descuento.
        double montoDescuento = valorCompra * descuentoPorcentaje;

        // Calcular el monto a pagar después del descuento.
        double montoAPagar = valorCompra - montoDescuento;

        // Mostrar el descuento aplicado.
        System.out.println("El color de la etiqueta es: " + colorEtiqueta);
        System.out.println("El porcentaje de descuento aplicado es: " + (descuentoPorcentaje * 100) + "%");
        System.out.println("El monto del descuento es: $" + montoDescuento);

        // Mostrar el monto total a pagar.
        System.out.println("El monto total a pagar es: $" + montoAPagar);

        entrada.close();
    }
}
