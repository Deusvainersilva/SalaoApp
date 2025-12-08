package com.example.salaoapi.servicos;

import com.example.salaoapi.clientes.ClienteModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_servicos")
public class ServicosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String servico;
    private BigDecimal preco;

    //Um servico para muitos usuários
    @OneToMany(mappedBy = "servicos")
    @JsonIgnore
    private List<ClienteModel> clientes;

}
