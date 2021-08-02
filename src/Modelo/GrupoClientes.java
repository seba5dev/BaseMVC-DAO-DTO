package Modelo;
//importar utilidad de crear arrays
import java.util.ArrayList;

//p=parametro

public class GrupoClientes {
    private ArrayList<Cliente> gclientes;

    //Crear array de los clientes
    public GrupoClientes() {
        gclientes = new ArrayList<Cliente>();
    }

    //Metodo para anadir clientes
    public void addElement(Cliente pCliente){
        gclientes.add(pCliente);
    }

    //Metodo para eliminar clientes
    public void removeElement(Cliente pCliente){
        gclientes.remove(pCliente);
    }

    //Metodo para buscar clientes por id
    public Cliente searchById(int pid){
        Cliente c = null;
        for(Cliente i: gclientes){
            if (i.getId() == (pid)) {
                c = i;
                break;
            }
        }
        return c;
    }

    //Metodo para mostrar todos los clientes
    public String listAll(){
        String str = "TODOS LOS CLIENTES\n";
        for(Cliente i:gclientes){
            str = str + i.toString();
        }
        str = str + "\n";
        return str;
    }
}
