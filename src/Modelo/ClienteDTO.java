package Modelo;

import java.util.ArrayList;

public class ClienteDTO {
    private ArrayList<Cliente> grupos;
    private ClienteDAO cliente;

    public ClienteDTO(){
        grupos = new ArrayList<Cliente>();
        cliente = new ClienteDAO();
    }

    public ArrayList<Cliente> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Cliente> grupos) {
        this.grupos = grupos;
    }

    public ClienteDAO getClienteDAO() {
        return cliente;
    }

    public void setClienteDAO(ClienteDAO cliente) {
        this.cliente = cliente;
    }
}
