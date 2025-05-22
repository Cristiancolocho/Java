import java.util.Scanner;

public class circunferencia {
public static void main(String[] args)
{
    Scanner entrada = new Scanner(System.in);

    double num1, calcular;

    System.out.println("Escribe el radio");
    num1 = Double.parseDouble(entrada.next());

   
    calcular=Math.PI*num1*2;

    System.out.println("El área de la circunferencia es: " + calcular);
    
}
}
 