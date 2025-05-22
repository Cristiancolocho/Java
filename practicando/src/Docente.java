package practicando.src;

public class Docente extends Persona {
    private String grupoAsignados;

    public Docente(){

    }

    public Docente(String nombre, String direccion, String email, String dui, int edad, String telefono,
            String grupoAsignados) {
        super(nombre, direccion, email, dui, edad, telefono);
        this.grupoAsignados = grupoAsignados;
    }

    public String getGrupoAsignados() {
        return grupoAsignados;
    }

    public void setGrupoAsignados(String grupoAsignados) {
        this.grupoAsignados = grupoAsignados;
    }

    public void PasarLista(){
        System.out.println("Pasando lista de estudiante");
    }
    public void SubirNotas(){
        System.out.println("Subiendo notas");
    }
@Override
    public void crear(){
        System.out.println("Creando docente");
    }

    @Override
    public void modificar(){
        super.modificar();
        System.out.println("modificando docente");
    }

    @Override
    public void imprimir(){
        System.out.println("Docente: " + getNombre());
        System.out.println("DUI: " + getDui());
    }
}
