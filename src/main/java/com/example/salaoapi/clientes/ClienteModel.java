package com.example.salaoapi.clientes;

import com.example.salaoapi.servicos.ServicosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_clientes")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;

    @ManyToOne //Muitos usuários para uma tarefa
    @JoinColumn(name = "servico_id")
    private ServicosModel servicos;


}
