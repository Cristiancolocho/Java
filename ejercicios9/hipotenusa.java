import java.util.Scanner;

public class hipotenusa {
    
public static void main(String[] args)
{
    Scanner entrada = new Scanner(System.in);

    double num1, num2, calcular;

    System.out.println("Escribe la base");
    num1 = Double.parseDouble(entrada.next());

    System.out.println("Escribe la altura");
    num2 = entrada.nextDouble();

    calcular=Math.pow(num1, 2) + Math.pow(num2,2);

    System.out.println("El área del rectángulo es " + calcular);
    
}
}
