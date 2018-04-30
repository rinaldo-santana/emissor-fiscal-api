package com.everest.emissorfiscal.api.repositories;

import com.everest.emissorfiscal.api.entities.Empresa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}