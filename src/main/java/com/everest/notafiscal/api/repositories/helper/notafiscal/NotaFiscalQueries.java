package com.everest.notafiscal.api.repositories.helper.notafiscal;

import org.springframework.data.jpa.repository.Query;

public interface NotaFiscalQueries {
	
	@Query("select count(*) from NotaFiscal nf where nf.carga = ? ")
	public Integer countByCarga(Integer carga);

}
