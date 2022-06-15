package com.magalu.Magalu.Communication.repository;

import com.magalu.Magalu.Communication.model.SolicitacaoAgendamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitacaoAgendamentoRepository extends JpaRepository<SolicitacaoAgendamentoModel, Integer> {
}
