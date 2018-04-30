package com.everest.emissorfiscal.api.services;

import java.util.List;

import com.everest.emissorfiscal.api.entities.NotaFiscal;
import com.everest.emissorfiscal.api.repositories.NotaFiscalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotaFiscalService {

    @Autowired
    NotaFiscalRepository notaFiscalRepository;

    public NotaFiscal salve(NotaFiscal notafiscal) {
       return notaFiscalRepository.save(notafiscal);
    }

    public List<NotaFiscal> salve(List<NotaFiscal> notasfiscais) {
        return notaFiscalRepository.save(notasfiscais);
    }

    public List<NotaFiscal> busqueTodas() {
        return notaFiscalRepository.findAll();
    }

    public NotaFiscal busquePorId(Long id) {
        return notaFiscalRepository.findOne(id);
    }

    public void deletePorId(Long id) {
        notaFiscalRepository.delete(id);
    }

    public NotaFiscal edite(NotaFiscal notafiscal) {
        Long id = notafiscal.getId();

        notaFiscalRepository.saveAndFlush(notafiscal);

        return this.busquePorId(id);
    }
    
    public List<NotaFiscal> busqueTodasPorCarga(Long cargaId) {
        return notaFiscalRepository.findAllByCarga(cargaId);
    }

}