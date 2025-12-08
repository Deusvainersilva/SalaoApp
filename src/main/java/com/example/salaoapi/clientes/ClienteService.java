package com.example.salaoapi.clientes;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    //Listar Clientes -Metodo GET
    public List<ClienteModel> listarClientes(){
        return clienteRepository.findAll();
    }
    //Metodo GET by ID
    public ClienteModel listarClientesId(Long id){
        Optional<ClienteModel> clienteId = clienteRepository.findById(id);
        return clienteId.orElse(null);
    }

    //Criar cliente -Metodo Post
    public ClienteModel criarCliente(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

    //Atualizar cliente -Metodo PUT
    public ClienteModel atualizarCliente(Long id, ClienteModel clienteAtualizado){
        ClienteModel cliente = clienteRepository.findById(id).orElse(null);
        return clienteRepository.save(cliente);
    }
    //Deletar cliente - Metodo DELETE
    public void deletarCliente(Long id){
        clienteRepository.deleteById(id);
    }

}
