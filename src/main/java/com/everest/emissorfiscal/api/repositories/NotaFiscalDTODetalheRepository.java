package com.everest.emissorfiscal.api.repositories;

import com.everest.emissorfiscal.api.dtos.notafiscal.Detalhe;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaFiscalDTODetalheRepository extends JpaRepository<Detalhe, Long> {

    // @Query("select d from Detalhe d join NotaFiscalDTO n where n.identificacao.mumero = :numero " 
    //      + "and n.identificacao.modelo = :modelo and n.identificacao.serie = :serie")
    // List<Detalhe> findNotaFiscalDetalhesByNumeroAndModeloAndSerie(@Param("numero") Long mumero, 
    //         @Param("modelo") String modelo,  @Param("serie") String serie);

    // List<Detalhe> findDetalhesById();

}