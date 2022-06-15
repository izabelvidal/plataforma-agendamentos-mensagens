package com.magalu.Magalu.Communication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "solicitacao")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SolicitacaoAgendamentoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime dataHora;
    private String destinatario;
    private String mensagem;
    private String formato;
    private String situacao;
}
