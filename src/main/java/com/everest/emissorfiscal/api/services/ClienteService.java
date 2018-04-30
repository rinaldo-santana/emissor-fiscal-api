package com.everest.emissorfiscal.api.services;

import java.util.List;

import com.everest.emissorfiscal.api.entities.Cliente;
import com.everest.emissorfiscal.api.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente salve(Cliente cliente) {
        return clienteRepository.save(cliente) ;
    }

    public List<Cliente> busqueTodas() {
        return clienteRepository.findAll();
    }

    public Cliente busquePorId(Long id) {
        return clienteRepository.findOne(id);
    }

    public void deletePorId(Long id) {
        clienteRepository.delete(id);
    }

    public Cliente edite(Cliente cliente) {
        Long id = cliente.getId();

        clienteRepository.saveAndFlush(cliente);

        return this.busquePorId(id);
    }

}