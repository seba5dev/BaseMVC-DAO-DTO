package Modelo;
import java.util.ArrayList;

public class ClienteDAO{
    public ClienteDAO(){

    }

    public String readGrupo(ArrayList<Cliente> grupos){
        String str = "TODOS LOS CLIENTES\n";
        for (int i = 0; i < grupos.size(); i++) {
            str = str.concat(grupos.get(i)+"\n");
        }
        return str;
    }
    
    /* public Cliente searchClienteById(int pId, ArrayList<Cliente> grupos){
        Cliente c = null;
        for(Cliente i: grupos){
            if (i.getId() == (pId)) {
                c = i;
                break;
            }
        }
        return c;
    } */

    public Cliente searchClienteId(int pId, ArrayList<Cliente> grupos){
        Cliente c = null;
        if (!grupos.isEmpty()) {
            for (int i = 0; i < grupos.size(); i++) {
               if (grupos.get(i).getId() == pId) {
                   c = grupos.get(i);
               } 
            }
        }
        return c;
    }

    /* public void createCliente(Cliente pCliente, ArrayList<Cliente> grupos){
        grupos.add(pCliente);
    } */

    public boolean addCliente(int id, String nombre, String apellido, ArrayList<Cliente> grupos) {
        Cliente nuevo = new Cliente(id, nombre, apellido);
        if (searchClienteId(id, grupos) == null) {
            grupos.add(nuevo);
            return true;
        } else{
            return false;
        }
    }

    /* public void deleteCliente(Cliente pCliente, ArrayList<Cliente> grupos){
        grupos.remove(pCliente);
    } */

    public boolean removeCliente(int id, ArrayList<Cliente> grupos) {
        boolean respuesta = false;
        Cliente eliminado = searchClienteId(id, grupos);
        if (eliminado != null) {
            grupos.remove(eliminado);
            respuesta = true;
        }
        return respuesta;
    }
}
