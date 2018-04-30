package com.everest.emissorfiscal.api.services;

import java.util.List;

import com.everest.emissorfiscal.api.entities.Cidade;
import com.everest.emissorfiscal.api.repositories.CidadeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository cidadeRepository;

    public Cidade salve(Cidade cidade) {
       return cidadeRepository.save(cidade);
    }

    public List<Cidade> busqueTodas() {
        return cidadeRepository.findAll();
    }

    public Cidade busquePorId(String id) {
        return cidadeRepository.findOne(id);
    }

    public void deletePorId(String id) {
        cidadeRepository.delete(id);
    }

    public Cidade edite(Cidade cidade) {
        String id = cidade.getCodigoIbge();

        cidadeRepository.saveAndFlush(cidade);

        return this.busquePorId(id);
    }
}