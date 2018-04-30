package com.everest.emissorfiscal.api.repositories;

import com.everest.emissorfiscal.api.entities.Cidade;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, String> {

}