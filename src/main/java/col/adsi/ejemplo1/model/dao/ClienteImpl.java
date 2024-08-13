package col.adsi.ejemplo1.model.dao;

import col.adsi.ejemplo1.model.entity.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteImpl implements ClienteDAO {


    private EntityManager entityManager;

    @Autowired
    public ClienteImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public Cliente save(Cliente cliente) {
        return entityManager.merge(cliente);
    }

    @Override
    public List<Cliente> getClientes() {
        TypedQuery<Cliente> query = entityManager.createQuery("FROM Cliente", Cliente.class);//seleccionar la tabla estudiante y ordenarla por apellido
        return query.getResultList();
    }
}
