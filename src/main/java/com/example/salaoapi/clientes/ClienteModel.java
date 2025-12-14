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
    @Column(name = "nome")
    private String nome;
    @Column (name = "email", unique = true)
    private String email;
    @Column(name = "telefone")
    private String telefone;

    @ManyToOne //Muitos usuários para uma tarefa
    @JoinColumn(name = "servico_id")
    private ServicosModel servicos;


}
