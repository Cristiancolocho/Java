import java.util.Scanner;
public class PositivoNNeutro {

public static void main(String[] args)
{
    Scanner entrada = new Scanner(System.in);

    System.out.print("Ingrese un número entero cualquiera: ");

    int numero = entrada.nextInt();

    String clasificacion;
        if (numero > 0) {
            clasificacion = "positivo";
        } else if (numero < 0) {
            clasificacion = "negativo";
        } else {
            clasificacion = "neutro"; // El cero se considera neutro
        }
       
    System.out.println("El número " + numero + " es " + clasificacion + ".");

    entrada.close();
}
}
