package Modelo;

public class Cliente {
    //Crear variables de la entidad
    private int id;
    private String nombre;
    private String apellido;
    
    //Generar el metodo constructor
    public Cliente(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Generar getters y setters de las variables
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Envio de variables de cualquier tipo a String
    @Override
    public String toString(){
        return "ID: "+id+", Nombre: "+nombre+", Apellido: "+apellido+"\n";
    }
}
