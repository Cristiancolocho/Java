  import java.util.Scanner;
public class Promedio {

public static void main(String[] args)
{
    Scanner entrada = new Scanner(System.in);

    double num1, num2, num3, calcular;

    System.out.println("Nota 1");
    num1 = Double.parseDouble(entrada.next());

    System.out.println("Nota 2");
    num2 = entrada.nextDouble();

    System.out.println("Nota 3");
    num3 = entrada.nextDouble();

    calcular=(num1+num2+num3)/3;

    System.out.println("El promedio es: "+ calcular);
    
}  
}
