package com.everest.emissorfiscal.api.services;

import com.everest.emissorfiscal.api.repositories.EmpresaRepository;
import java.util.List;
import com.everest.emissorfiscal.api.entities.Empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa salve(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public List<Empresa> busqueTodas() {
        return empresaRepository.findAll();
    }

    public Empresa busquePorId(Long id) {
        return empresaRepository.findOne(id);
    }

    public void deletePorId(Long id) {
        empresaRepository.delete(id);
    }

    public Empresa edite(Empresa empresa) {
        Long id = empresa.getId();

        empresaRepository.saveAndFlush(empresa);

        return this.busquePorId(id);
    }

}