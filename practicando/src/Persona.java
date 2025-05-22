package practicando.src;

public abstract class Persona {
    private String nombre;
    private String direccion;
    private String email;
    private String dui;
    private int edad;
    private String telefono;
    
    public Persona() {
    }

    public Persona(String nombre, String direccion, String email, String dui, int edad, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.dui = dui;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getDui() {
        return dui;
    }


    public void setDui(String dui) {
        this.dui = dui;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void crear(){
        System.out.println("Creando registro...");
    }
    public void modificar(){
        System.out.println("modificando registro...");
    }
    public void eliminar(){
        System.out.println("eliminando registro...");
    }
    public void buscar(String query){
        System.out.println("buscando registro..."+ query);
    }

    public abstract void imprimir();
}
