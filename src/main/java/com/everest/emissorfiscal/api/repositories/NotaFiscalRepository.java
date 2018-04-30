package com.everest.emissorfiscal.api.repositories;

import com.everest.emissorfiscal.api.entities.NotaFiscal;
import com.everest.emissorfiscal.api.repositories.helper.notafiscal.NotaFiscalQueries;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, Long>, NotaFiscalQueries {
   
}
