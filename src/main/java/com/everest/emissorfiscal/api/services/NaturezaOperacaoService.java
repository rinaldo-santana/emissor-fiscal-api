package com.everest.emissorfiscal.api.services;

import java.util.List;

import com.everest.emissorfiscal.api.entities.NaturezaOperacao;
import com.everest.emissorfiscal.api.repositories.NaturezaOperacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaturezaOperacaoService {

    @Autowired
     NaturezaOperacaoRepository naturezaOperacaoRepository;

    public NaturezaOperacao salve(NaturezaOperacao naturezaOperacao) {
       return naturezaOperacaoRepository.save(naturezaOperacao);
    }

    public List<NaturezaOperacao> busqueTodas() {
        return naturezaOperacaoRepository.findAll();
    }

    public NaturezaOperacao busquePorId(Long id) {
        return naturezaOperacaoRepository.findOne(id);
    }

    public void deletePorId(Long id) {
        naturezaOperacaoRepository.delete(id);
    }

    public NaturezaOperacao edite(NaturezaOperacao naturezaOperacao) {
        Long id = naturezaOperacao.getId();

        naturezaOperacaoRepository.saveAndFlush(naturezaOperacao);

        return this.busquePorId(id);
    }

}