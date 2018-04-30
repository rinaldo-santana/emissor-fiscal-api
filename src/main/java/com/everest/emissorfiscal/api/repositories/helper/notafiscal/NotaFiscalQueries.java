package com.everest.emissorfiscal.api.repositories.helper.notafiscal;

import java.util.List;

import com.everest.emissorfiscal.api.entities.NotaFiscal;

import org.springframework.data.jpa.repository.Query;

public interface NotaFiscalQueries {
	
	@Query("select count(*) from NotaFiscal nf where nf.carga = ? ")
	Integer countByCarga(Integer carga);

	List<NotaFiscal> findAllByCarga(Long cargaId);
}
