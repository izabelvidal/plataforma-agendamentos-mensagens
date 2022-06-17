package com.magalu.Magalu.Communication.controller.mapper;

import com.magalu.Magalu.Communication.model.SolicitacaoAgendamentoModel;
import com.magalu.Magalu.Communication.model.dto.SolicitacaoAgendamentoDto;

import java.util.ArrayList;
import java.util.List;

public class SolicitacaoAgendamentoMapper {

    public static SolicitacaoAgendamentoModel fromDto(SolicitacaoAgendamentoDto dto){
        SolicitacaoAgendamentoModel model = new SolicitacaoAgendamentoModel();
        model.setDataHora(dto.getDataHora());
        model.setDestinatario(dto.getDestinatario());
        model.setMensagem(dto.getMensagem());
        model.setFormato(validaFormato(dto.getFormato()));
        return model;
    }

    public static SolicitacaoAgendamentoDto toDto(SolicitacaoAgendamentoModel model){
        SolicitacaoAgendamentoDto dto = new SolicitacaoAgendamentoDto();
        dto.setSituacao(model.getSituacao());
        return dto;
    }

    public static String validaFormato(String formato){
        List<String> formatos = populaFormatos();
        if (formatos.contains(formato)){
            return formato;
        }

        return null;
    }

    public static List<String> populaFormatos(){
        List<String> formatos = new ArrayList<>();
        formatos.add("email");
        formatos.add("sms");
        formatos.add("push");
        formatos.add("whatsapp");
        return formatos;
    }
}
