import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("ingresa el primer numero");
        int num1 = entrada.nextInt();

        System.out.println("ingresa el segundo numero");
        int num2 = entrada.nextInt();

        System.out.println("ingresa el tercer numero");
         int num3 = entrada.nextInt();

        int mayor;

        // 4. Comparar los números para encontrar el mayor.
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El número mayor de los tres ingresados es: " + mayor);

        entrada.close();

    }
}
