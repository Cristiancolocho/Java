
package practicando;

import practicando.src.Docente;
import practicando.src.Empleado;
import practicando.src.Estudiante;
import practicando.src.IExtra;

public class Main {
    public static void main(String[] args) {

     Estudiante estudiante = new Estudiante();
    estudiante.setNombre("Juan Perez");
    estudiante.setDui("12345678-9");
    estudiante.crear();
    estudiante.modificar();
    estudiante.verNotas();


    Docente docente = new Docente();
    docente.setNombre("Maria Lopez");
    docente.setTelefono("1234-5678");
    docente.setGrupoAsignados("Grupo A");
    docente.crear();
    docente.modificar();  
    docente.PasarLista();
  
    estudiante.imprimir();
    docente.imprimir();

    Empleado empleado = new Empleado();
    empleado.setNombre("Carlos Gomez");
    empleado.setDui("98765432-1");
    empleado.setTelefono("8765-4321");
    empleado.imprimirTodosLosDatos();
    empleado.setDepartamento("Recursos");
    empleado.obtenerPorId();
    imprimirDatos(empleado);

}
public  static void imprimirDatos(IExtra iExtra){
    System.out.println("Imprimir datos ");
    iExtra.imprimirTodosLosDatos();
}

}
