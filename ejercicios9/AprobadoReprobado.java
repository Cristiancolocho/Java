import java.util.Scanner;

public class AprobadoReprobado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3;
        boolean notasValidas = false;

        do {
            System.out.print("Ingrese la primera nota (entre 0 y 10): ");
            nota1 = entrada.nextDouble();

            System.out.print("Ingrese la segunda nota (entre 0 y 10): ");
            nota2 = entrada.nextDouble();

            System.out.print("Ingrese la tercera nota (entre 0 y 10): ");
            nota3 = entrada.nextDouble();

            if ((nota1 >= 0 && nota1 <= 10) && (nota2 >= 0 && nota2 <= 10) && (nota3 >= 0 && nota3 <= 10)) {
                notasValidas = true;
            } else {
                System.out.println("Error: Las notas deben estar entre 0 y 10. Intente nuevamente.");
            }
        } while (!notasValidas);

       double calcular = (nota1 + nota2 + nota3) / 3;

        double notaAprobatoria = 7.0;

        String estado;
        if (calcular >= notaAprobatoria) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
        
        System.out.println("El promedio es: " + calcular + " El estudiante esta: " + estado);
         entrada.close();

    }
}