package com.everest.emissorfiscal.api.repositories;

import java.util.Date;
import java.util.List;

import com.everest.emissorfiscal.api.dtos.NotaFiscalDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NotaFiscalDTORepository extends JpaRepository<NotaFiscalDTO, Long> {

	@Query("select distinct n from NotaFiscalDTO n join fetch n.detalhes")
	List<NotaFiscalDTO> findAllNotaFiscalDTO();

	@Query("select distinct n from NotaFiscalDTO n join fetch n.detalhes where n.id = :idNotaFiscal")
	NotaFiscalDTO findNotaFiscalDTOById(@Param("idNotaFiscal") Long id);

	@Query("select distinct n from NotaFiscalDTO n join fetch n.detalhes where n.destinatario.cnpj = :cnpj")
	List<NotaFiscalDTO> findNotaFiscalDTOByDestinatario(@Param("cnpj") String cnpj);
	
	@Query("select distinct n from NotaFiscalDTO n join fetch n.detalhes where n.identificacao.dataEmissao between :inicio and :fim")
	List<NotaFiscalDTO> findNotaFiscalDTOByEmissaoEntre(@Param("inicio") Date inicio, @Param("fim") Date fim);
	
}