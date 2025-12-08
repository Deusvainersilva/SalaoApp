package com.example.salaoapi.servicos;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicosService {

    private ServicosRepository servicosRepository;

    public ServicosService(ServicosRepository servicosRepository) {
        this.servicosRepository = servicosRepository;
    }

    //Metodo GET
    public List<ServicosModel> listarServicos(){
        return servicosRepository.findAll();
    }
    //Metodo GET by ID

    //Metodo POST

    //Metodo PUT

    //Metodo DELETE
}
