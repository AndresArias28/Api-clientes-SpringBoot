package col.adsi.ejemplo1.model.dao;

import col.adsi.ejemplo1.model.entity.Cliente;

import java.util.List;


public interface ClienteDAO {


    Cliente save(Cliente cliente);

    List<Cliente> getClientes();
}
