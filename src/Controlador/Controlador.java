package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDTO;
import Vista.Consola;

public class Controlador {
    private Consola vc;
    private ClienteDTO clientes;

    public Controlador(){
        vc = new Consola();
        clientes = new ClienteDTO();
        Menu();
    }

    public void Menu(){
        int opcion = 0;
        String menu="Seleccione tarea a realizar\n"+
                    "1. Ingresar cliente\n"+
                    "2. Buscar cliente\n"+
                    "3. Modificar cliente\n"+
                    "4. Eliminar cliente\n"+
                    "5. Ver todos los clientes\n"+
                    "6. Salir\n"+
                    "Opción: ";
        do{
            opcion = vc.readInt(menu);
            switch(opcion){
                case 1:
                    addCliente();
                    break;
                case 2:
                    searchCliente();
                    break;
                case 3:
                    updateCliente();
                    break;
                case 4:
                    deleteCliente();
                    break;
                case 5:   
                    showAllCliente();
                    break;
                case 6:
                    vc.printMsg("Hasta pronto");
                    break;
                default:
                    vc.printMsg("Opcion incorrecta");
                    break;
            }
        }while(opcion!=6);
    }

    public void addCliente() {
        int id;
        String nombre, apellido;
        vc.printMsg("INGRESAR CLIENTE");
        id = vc.readInt("Ingresar id: ");
        nombre = vc.readString("Ingresar nombre: ");
        apellido = vc.readString("Ingresar apellido: ");
        if (clientes.getClienteDAO().addCliente(id, nombre, apellido, clientes.getGrupos()) == true) {
            vc.printMsg("Cliente anadido");
        }else{
            vc.printMsg("Cliente no anadido");
        }
    }

    public void searchCliente() {
        int id;
        vc.printMsg("BUSCAR CLIENTE\n");
        id = vc.readInt("Ingresar id: ");
        Cliente respuesta = clientes.getClienteDAO().searchClienteId(id, clientes.getGrupos());
        if (respuesta != null) {
            vc.printMsg(respuesta.toString());
        }else{
            vc.printMsg("Cliente no encontrado.");
        }
    }

    public void updateCliente() {
        int id;
        String nombre, apellido;
        vc.printMsg("MODIFICAR CLIENTE");    
        id = vc.readInt("Ingresar id: ");
        Cliente respuesta = clientes.getClienteDAO().searchClienteId(id, clientes.getGrupos());
        if (respuesta != null){
            /* UTILIZADOS CUANDO NO TIENEN QUE CAMBIAR
            nombre = respuesta.getNombre()
            apellido = respuesta.getApellido(); */
            nombre = vc.readString("Ingrese nuevo nombre: ");
            apellido = vc.readString("Ingrese nuevo apellido: ");
            clientes.getClienteDAO().removeCliente(id, clientes.getGrupos());
            clientes.getClienteDAO().addCliente(id, nombre, apellido, clientes.getGrupos());
            vc.printMsg("Cliente modificado.");
        }else{
            vc.printMsg("Cliente no encontrado");
        }
    }

    public void deleteCliente() {
        int id;
        vc.printMsg("ELIMINAR CLIENTE\n");    
        id = vc.readInt("Ingresar id: ");
        if (clientes.getClienteDAO().removeCliente(id, clientes.getGrupos())) {
            vc.printMsg("Cliente eliminado");
        }else{
            vc.printMsg("Cliente no encontrado");
        }
    }

    public void showAllCliente() {
        vc.printMsg(clientes.getClienteDAO().readGrupo(clientes.getGrupos()));
    }

}
