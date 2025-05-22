public class operacion {
    public int Sumar(int a, int b) {
        if(a<0 || b<0) {
            System.out.println("Error: No se pueden sumar números negativos");
            return -1;
        }
        return a + b;
    }
    public double Sumar(double a, double b) {
        return a + b;
    }
    public int Sumar(int a, int b, int c) {
        return a + b + c;
    }
}
