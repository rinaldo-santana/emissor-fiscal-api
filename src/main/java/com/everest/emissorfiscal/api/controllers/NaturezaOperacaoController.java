package com.everest.emissorfiscal.api.controllers;

import java.util.List;

import com.everest.emissorfiscal.api.entities.NaturezaOperacao;
import com.everest.emissorfiscal.api.response.Response;
import com.everest.emissorfiscal.api.services.NaturezaOperacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping("/operacoes")
public class NaturezaOperacaoController {

    @Autowired
    NaturezaOperacaoService naturezaOperacaoService;

    @PostMapping
    public ResponseEntity<Response<String>> salvarCidade(NaturezaOperacao naturezaOperacao) {

        Response<String> response = new Response<String>();

        try {

            NaturezaOperacao naturezaOperacaoSalva = this.naturezaOperacaoService.salve(naturezaOperacao);

            if ((naturezaOperacaoSalva == null) || (naturezaOperacaoSalva.getId() == null)) {
                throw new RuntimeException("Natureza de operacao inválido! Não pode ser salva!");
            }

            response.setDados("O natureza de operacao " + naturezaOperacaoSalva.getNome() + " foi salvo com sucesso");

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    /**
     * @exemple 
     * URL: curl http://localhost:8090/naturezaOperacaos
     *  
     */   
    @GetMapping
    public ResponseEntity<Response<List<NaturezaOperacao>>> buscarTodosNaturezaOperacaoServices() {

        Response<List<NaturezaOperacao>> response = new Response<List<NaturezaOperacao>>();

        try {

            List<NaturezaOperacao> naturezasOperacoes = this.naturezaOperacaoService.busqueTodas();
            response.setDados(naturezasOperacoes);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    } 

    @GetMapping("/{id}")
    public ResponseEntity<Response<NaturezaOperacao>> buscarNaturezaOperacaoServicePorId(@PathVariable("id") Long id) {

        Response<NaturezaOperacao> response = new Response<NaturezaOperacao>();

        try {

            NaturezaOperacao naturezaOperacao = this.naturezaOperacaoService.busquePorId(id);
            response.setDados(naturezaOperacao);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response<String>> deletarNaturezaOperacaoPorId(@PathVariable("id") Long id) {

        Response<String> response = new Response<String>();

        try {

            naturezaOperacaoService.deletePorId(id);
            response.setDados("Natureza de operacao excluída com sucesso");

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }


    @PutMapping
    public ResponseEntity<Response<NaturezaOperacao>> editarNaturezaOperacao(NaturezaOperacao naturezaOperacao) {

        Response<NaturezaOperacao> response = new Response<NaturezaOperacao>();

        try {

            NaturezaOperacao naturezaOperacaoEditado = this.naturezaOperacaoService.edite(naturezaOperacao);
            response.setDados(naturezaOperacaoEditado);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);

    }


}