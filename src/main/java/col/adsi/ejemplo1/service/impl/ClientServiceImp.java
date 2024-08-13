package col.adsi.ejemplo1.service.impl;

import col.adsi.ejemplo1.model.dao.ClienteDAO;
import col.adsi.ejemplo1.model.entity.Cliente;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImp implements ClientService{

    ClienteDAO clienteDAO;

    @Autowired
    public ClientServiceImp(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public List<Cliente> encontrarClientes() {
        return clienteDAO.getClientes();
    }

    @Transactional
    @Override
    public Cliente guardarCliente(Cliente cliente) {
    return clienteDAO.save(cliente);
    }
}
