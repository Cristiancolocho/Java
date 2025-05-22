package practicando.src;

public class  Estudiante extends Persona {
    private String carrera;

    public Estudiante() {
    }



    public Estudiante(String nombre, String direccion, String email, String dui, int edad, String telefono,
            String carrera) {
        super(nombre, direccion, email, dui, edad, telefono);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void PresentarTareas(){
        System.out.println("Presentando notas");
    }
public void verNotas(){
        System.out.println("Viendo notas");
    }
    
     @Override
    public void imprimir(){
        System.out.println("Docente: " + getNombre());
        System.out.println("DUI: " + getDui());
    }
}
