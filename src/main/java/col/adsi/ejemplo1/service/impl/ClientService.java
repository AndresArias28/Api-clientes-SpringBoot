package col.adsi.ejemplo1.service.impl;

import col.adsi.ejemplo1.model.entity.Cliente;

import java.util.List;

public interface ClientService {

    List<Cliente> encontrarClientes();

    Cliente guardarCliente(Cliente cliente);
}
