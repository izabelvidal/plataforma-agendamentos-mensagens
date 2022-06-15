package com.magalu.Magalu.Communication.service;

import com.magalu.Magalu.Communication.model.SolicitacaoAgendamentoModel;
import com.magalu.Magalu.Communication.model.dto.SolicitacaoAgendamentoDto;
import com.magalu.Magalu.Communication.repository.SolicitacaoAgendamentoRepository;
import com.magalu.Magalu.Communication.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SolicitacaoAgendamentoService {

    @Autowired
    private SolicitacaoAgendamentoRepository repository;

    public SolicitacaoAgendamentoModel insert(SolicitacaoAgendamentoModel obj) {
        obj.setSituacao("agendado");
        obj = repository.save(obj);
        return obj;
    }

    public SolicitacaoAgendamentoModel find(Integer id) {
        Optional<SolicitacaoAgendamentoModel> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + SolicitacaoAgendamentoModel.class.getName()));
    }
}
