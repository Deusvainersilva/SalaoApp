package com.example.salaoapi.clientes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    //Get
    @GetMapping("/listar")
    public List<ClienteModel>listarClientes(){
        return clienteService.listarClientes();
    }
    //Post
    @PutMapping("/criar")
    public ResponseEntity<ClienteModel> criar (@RequestBody ClienteModel cliente){
        ClienteModel novo = clienteService.criarCliente(cliente);
        return ResponseEntity.status(201).body(novo);
    }

    //Put
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<ClienteModel> atualizar(@PathVariable Long id, @RequestBody ClienteModel clienteAtualizado) {
        ClienteModel atualizado = clienteService.atualizarCliente(id, clienteAtualizado);
        return (atualizado != null) ? ResponseEntity.ok(atualizado) : ResponseEntity.notFound().build();
    }

    //Delete
    @DeleteMapping
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id){
        clienteService.deletarCliente(id);
        return ResponseEntity.noContent().build();
    }



}
