package com.magalu.Magalu.Communication.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class SolicitacaoAgendamentoDto {
    private LocalDateTime dataHora;
    private String destinatario;
    private String mensagem;
    private String formato;
    private String situacao;
}
