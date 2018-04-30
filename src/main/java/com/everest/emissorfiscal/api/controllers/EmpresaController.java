package com.everest.emissorfiscal.api.controllers;

import java.util.List;

import com.everest.emissorfiscal.api.entities.Empresa;
import com.everest.emissorfiscal.api.services.EmpresaService;
import com.everest.emissorfiscal.api.response.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/empresas")
public class EmpresaController {


    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public ResponseEntity<Response<String>> salvarEmpresa(Empresa empresa) {

        Response<String> response = new Response<String>();

        try {

            Empresa empresaSalva = this.empresaService.salve(empresa);

            if ((empresaSalva == null) || (empresaSalva.getId() == null)) {
                throw new RuntimeException("Empresa inválida! Não pode ser salva!");
            }

            response.setDados("A empresa " + empresaSalva.getNome() + " foi salva com sucesso");

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<Response<List<Empresa>>> buscarTodasEmpresas() {

        Response<List<Empresa>> response = new Response<List<Empresa>>();

        try {

            List<Empresa> empresas = this.empresaService.busqueTodas();
            response.setDados(empresas);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }    

    @GetMapping("/{id}")
    public ResponseEntity<Response<Empresa>> buscarEmpresaPorId(@PathVariable Long id) {

        Response<Empresa> response = new Response<Empresa>();

        try {

            Empresa empresa = this.empresaService.busquePorId(id);
            response.setDados(empresa);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    @PutMapping
    public ResponseEntity<Response<Empresa>> editarEmpresa(Empresa empresa) {

        Response<Empresa> response = new Response<Empresa>();

        try {

            Empresa empresaEditada = this.empresaService.edite(empresa);
            response.setDados(empresaEditada);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);

    }    
   

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Response<String>> deletarCidadePorId(@PathVariable Long id) {

    // }
}