package com.everest.notafiscal.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everest.notafiscal.api.entities.NotaFiscal;
import com.everest.notafiscal.api.repositories.helper.notafiscal.NotaFiscalQueries;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, Long>, NotaFiscalQueries {

}
