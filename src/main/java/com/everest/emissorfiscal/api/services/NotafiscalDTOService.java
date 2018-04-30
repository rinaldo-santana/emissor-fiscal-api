package com.everest.emissorfiscal.api.services;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import com.everest.emissorfiscal.api.dtos.NotaFiscalDTO;
import com.everest.emissorfiscal.api.repositories.NotaFiscalDTODetalheRepository;
import com.everest.emissorfiscal.api.repositories.NotaFiscalDTORepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotafiscalDTOService {

    @Autowired
    NotaFiscalDTORepository notaFiscalDTORepository;

    @Autowired
    NotaFiscalDTODetalheRepository detalheRepository;

    @Transactional
    public NotaFiscalDTO salve(NotaFiscalDTO notafiscal) {
        return this.salveNotaFiscal(notafiscal);
    }

    @Transactional
    public List<NotaFiscalDTO> salve(List<NotaFiscalDTO> notasfiscais) {
        notasfiscais.forEach(nota -> this.salveNotaFiscal(nota));
        return notasfiscais;        
    }

    @Transactional
    public List<NotaFiscalDTO> busqueTodas() {
        return this.notaFiscalDTORepository.findAllNotaFiscalDTO();
        // return notaFiscalDTORepository.busqueTodas();
    }

    public NotaFiscalDTO busquePorId(Long id) {
        return this.notaFiscalDTORepository.findNotaFiscalDTOById(id);
    }


    public  List<NotaFiscalDTO> busquePorEmissaoEntre(Date dataInicial, Date dataFinal) {
        return  this.notaFiscalDTORepository
                    .findNotaFiscalDTOByEmissaoEntre(dataInicial, dataFinal);
    }

    
    public void deletePorId(Long id) {
        this.notaFiscalDTORepository.delete(id);
    }

    // public NotaFiscal edite(NotaFiscal notafiscal) {
    //     Long id = notafiscal.getId();

    //     notaFiscalRepository.saveAndFlush(notafiscal);

    //     return this.busquePorId(id);
    // }
    
    // public List<NotaFiscal> busqueTodasPorCarga(Long cargaId) {
    //     return notaFiscalRepository.findAllByCarga(cargaId);
    // }    


    private NotaFiscalDTO salveNotaFiscal(NotaFiscalDTO notafiscal) {
		NotaFiscalDTO result = this.notaFiscalDTORepository.save(notafiscal);
        notafiscal.getDetalhes().forEach(detalhe -> this.detalheRepository.save(detalhe));
        return result;
	}
}