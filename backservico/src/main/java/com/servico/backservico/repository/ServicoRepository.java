package com.servico.backservico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.servico.backservico.entity.Servico;
// Tabela servico e atributo long. ID
public interface ServicoRepository extends JpaRepository<Servico,Long>{
    
    @Query("select s from Servico s where s.valorPago <> null and valorPago >0")
    List<Servico> buscarServicosPagamentoPendente();

    @Query("select s from Servico s where s.status == 'cancelado' ")
    List<Servico> buscarServicosCancelados();
}
