package rodarspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rodarspring.model.Cliente;
import rodarspring.repository.ClientesRepository;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired
    public void serRepository(ClientesRepository repository){
        this.repository = repository;
    }


    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }
    public void  validarCliente(Cliente cliente){
        // aplica validações
    }


}
