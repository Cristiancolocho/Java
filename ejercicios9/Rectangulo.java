import java.util.Scanner;

public class Rectangulo {

public static void main(String[] args)
{
    Scanner entrada = new Scanner(System.in);

    double num1, num2, calcular;

    System.out.println("Escribe la base");
    num1 = Double.parseDouble(entrada.next());

    System.out.println("Escribe la altura");
    num2 = entrada.nextDouble();

    calcular=num1*num2;

    System.out.println("El área del rectángulo es " + calcular);
    
}
}