package com.everest.emissorfiscal.api.repositories;

import com.everest.emissorfiscal.api.entities.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}