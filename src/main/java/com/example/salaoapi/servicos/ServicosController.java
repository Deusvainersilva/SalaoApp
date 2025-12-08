package com.example.salaoapi.servicos;

import com.example.salaoapi.clientes.ClienteModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicosController {

    private ServicosService servicosService;

    public ServicosController(ServicosService servicosService) {
        this.servicosService = servicosService;
    }

    //Get
    @GetMapping("/listar")
    public List<ServicosModel> listarServicos(){
        return servicosService.listarServicos();
    }
    //Post

    //Put

    //Delete
}
