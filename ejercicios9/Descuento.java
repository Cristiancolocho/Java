import java.util.Scanner;

public class Descuento {
   
public static void main(String[] args)
{
    Scanner entrada = new Scanner(System.in);

    double num1, num2, calcular;

    System.out.println("Escribe el precio del producto");
    num1 = Double.parseDouble(entrada.next());


    calcular=num1-10;

    System.out.println("El monto a pagar es " + calcular);
    
}
}
