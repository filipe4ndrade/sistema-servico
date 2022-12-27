package com.servico.backservico.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity 
@Table(name = "servico") //cria tabela servico
@Data //get e set
public class Servico {
    
    @Id //chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) //gera automaticamente
    private Long id;
    private String nomeCliente;
    @Temporal(TemporalType.DATE) //formato
    private Date dataInicio = new Date();
    @Temporal(TemporalType.DATE)
    private Date dataTermino;
    private String descricaoServico;
    private Double valorServico;
    private Double valorPago;
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    private String status; //Pendente, Realizado ou Cancelado

}
