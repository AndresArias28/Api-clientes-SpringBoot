package col.adsi.ejemplo1.controller;

import ch.qos.logback.core.net.server.Client;
import col.adsi.ejemplo1.model.dao.ClienteDAO;
import col.adsi.ejemplo1.model.entity.Cliente;
import col.adsi.ejemplo1.service.impl.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class clienteController {

    private ClientService clienteService;

    @Autowired
    public clienteController(ClientService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("cliente")
    public List<Cliente> mostrar() {
        return clienteService.encontrarClientes();
    }

    @PostMapping("cliente")
    public Cliente agregar(@RequestBody Cliente cliente) {
        return clienteService.guardarCliente(cliente);
    }

}
