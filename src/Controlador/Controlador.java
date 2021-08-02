package Controlador;

import Modelo.Cliente;
import Vista.Consola;
import Modelo.GrupoClientes;

public class Controlador {
    private Cliente c;
    private Consola vc;
    private GrupoClientes gc;

    public Controlador(){
        vc = new Consola();
        gc = new GrupoClientes();
        Menu();
    }

    public void Menu(){
        int opcion = 0, id;
        String str, nombre, apellido;
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
                    vc.printMsg("INGRESAR CLIENTE");
                    id = vc.readInt("Ingresar id: ");
                    c = gc.searchById(id);
                    if(c == null){
                        nombre = vc.readString("Ingresar nombre: ");
                        apellido = vc.readString("Ingresar apellido: ");
                        c = new Cliente(id, nombre, apellido);
                        gc.addElement(c);
                    }else{
                        vc.printMsg("Cliente ya existe");
                    }
                    break;
                case 2:
                    vc.printMsg("BUSCAR CLIENTE\n");
                    id = vc.readInt("Ingresar id: ");
                    c = gc.searchById(id);
                    if (c == null) {
                        vc.printMsg("Cliente no encontrado");
                    }else{
                        str = "Informacion del cliente\n";
                        str = str + "Id: ";
                        str = str + c.getId()+"\n";
                        str = str + "Nombres: ";
                        str = str + c.getNombre()+"\n";
                        str = str + "Apellidos: ";
                        str = str + c.getApellido()+"\n";
                        vc.printMsg(str);
                    }
                    break;
                case 3:
                    vc.printMsg("MODIFICAR CLIENTE");    
                    id = vc.readInt("Ingresar id: ");
                    c = gc.searchById(id);
                    if (c == null) {
                        vc.printMsg("Cliente no encontrado\n");
                    }else{
                        c.setNombre(vc.readString("Inserte nombre: "));
                        c.setApellido(vc.readString("Inserte apellido: "));
                    }
                    break;
                case 4:
                    vc.printMsg("ELIMINAR CLIENTE\n");    
                    id = vc.readInt("Ingresar id: ");
                    c = gc.searchById(id);
                    if (c == null) {
                        vc.printMsg("Cliente no encontrado");
                    }else{
                        gc.removeElement(c);
                        vc.printMsg("Cliente eliminado\n");
                    }
                    break;
                case 5:   
                    str = gc.listAll();
                    vc.printMsg(str);
                case 6:
                    break;
                default:
                    vc.printMsg("Opcion incorrecta");
                    break;
            }
        }while(opcion!=6);
    }
}
