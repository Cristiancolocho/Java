package practicando.src;

public class Empleado extends Persona implements IExtra, ISearch {
    private String Departamento;

    public Empleado() {
    }

    public Empleado(String nombre, String direccion, String email, String dui, int edad, String telefono,
            String departamento) {
        super(nombre, direccion, email, dui, edad, telefono);
        Departamento = departamento;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public void realizarTareasdelTrabajo() {
        System.out.println("Realizando las tareas");
    }

     @Override
    public void imprimir(){
        System.out.println("Docente: " + getNombre());
        System.out.println("DUI: " + getDui());
    }

     @Override
     public void obtenerDatos() {
       System.out.println("Nombre: " + getNombre());
       System.out.println("DUI: " + getDui());
         System.out.println("Direccion: " + getDireccion());
            System.out.println("Email: " + getEmail());
            System.out.println("Edad: " + getEdad());
            System.out.println("Telefono: " + getTelefono());
            System.out.println("Departamento: " + getDepartamento());

     }

     @Override
     public void obtenerPorId() {
        System.out.println("ID: " + getDui());
        return;
     }

     @Override
     public void imprimirTodosLosDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("DUI: " + getDui());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Email: " + getEmail());
        System.out.println("Edad: " + getEdad());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Departamento: " + getDepartamento());
     }
}
