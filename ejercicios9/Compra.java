import java.util.Scanner;

public class Compra {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: $");
        double valorCompra = entrada.nextDouble();

        double descuento = 0;
        double montoAPagar;

        if (valorCompra < 100) {
            descuento = 0;
        } else if (valorCompra >= 100 && valorCompra <= 300) {
            descuento = valorCompra * 0.10; 
        } else {
            descuento = valorCompra * 0.15; 
        }

        montoAPagar = valorCompra - descuento;

        System.out.println("El descuento aplicado es de: $" +  descuento);

        System.out.println("El monto total a pagar es de: $" +montoAPagar);

        entrada.close();
    }
}
