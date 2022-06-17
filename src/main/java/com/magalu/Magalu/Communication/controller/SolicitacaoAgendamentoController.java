package com.magalu.Magalu.Communication.controller;

import com.magalu.Magalu.Communication.controller.mapper.SolicitacaoAgendamentoMapper;
import com.magalu.Magalu.Communication.model.SolicitacaoAgendamentoModel;
import com.magalu.Magalu.Communication.model.dto.SolicitacaoAgendamentoDto;
import com.magalu.Magalu.Communication.service.SolicitacaoAgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/agendamento")
public class SolicitacaoAgendamentoController {

    @Autowired
    private SolicitacaoAgendamentoService service;

    @PostMapping("/cadastro")
    public ResponseEntity<SolicitacaoAgendamentoModel> insert(@RequestBody SolicitacaoAgendamentoDto request){
        SolicitacaoAgendamentoModel obj = SolicitacaoAgendamentoMapper.fromDto(request);
        obj = service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SolicitacaoAgendamentoDto> findByid(@PathVariable Integer id){
        SolicitacaoAgendamentoModel model = service.find(id);
        SolicitacaoAgendamentoDto dto = SolicitacaoAgendamentoMapper.toDto(model);
        return ResponseEntity.ok().body(dto);
    }

    @PutMapping("/cancelar/{id}")
    public ResponseEntity<Void> updateStatus(@PathVariable Integer id){
        service.updateSituacao(id);
        return ResponseEntity.noContent().build();
    }

}
