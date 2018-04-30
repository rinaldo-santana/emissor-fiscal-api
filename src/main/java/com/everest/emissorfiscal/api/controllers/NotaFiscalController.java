package com.everest.emissorfiscal.api.controllers;

import java.util.List;

import com.everest.emissorfiscal.api.entities.NotaFiscal;
import com.everest.emissorfiscal.api.response.Response;
import com.everest.emissorfiscal.api.services.NotaFiscalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/notasfiscais")
public class NotaFiscalController {

    @Autowired
    NotaFiscalService notafiscalService;

    @GetMapping
    public ResponseEntity<Response<List<NotaFiscal>>> buscarTodasNotasFiscais() {

        Response<List<NotaFiscal>> response = new Response<List<NotaFiscal>>();

        try {

            List<NotaFiscal> cidades = this.notafiscalService.busqueTodas();
            response.setDados(cidades);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    /**
     * curl  http://localhost:8090/notasfiscais/carga/2673
     */
    @GetMapping("/carga/{id}")
    public ResponseEntity<Response<List<NotaFiscal>>> buscarNotaFiscaiPorCarga(@PathVariable("id") Long cargaId) {

        Response<List<NotaFiscal>> response = new Response<List<NotaFiscal>>();

        try {

            List<NotaFiscal> notasfiscais = this.notafiscalService.busqueTodasPorCarga(cargaId);
            response.setDados(notasfiscais);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }


    /**
     * curl -d '{"name":"John Doe","course":"Linux"}' httpbin.org/post
     * curl -H 'Content-Type: application/json' -d '{"name":"John Doe","course":"Linux"}' httpbin.org/post
     * 
     * curl -H 'Content-Type: application/json' -d '
     *          { empresa: {nome:"", cnpj:"", inscricaoEstadual: ""},serie: "",numero: "",dataEmissao: "",horaEmissao: "",naturezaOoperacao: {id="", nome:""},cliente: {id="", nome:"", cadastroNacional:"", registroEstadual:""}chaveEletronica: "",protocoloNfe: "",status: "",carga: "",valorBaseIcms: 0,valorIcms: 0,valorBaseIcmsST: 0,valorIcmsST: 0,valorProdutos: 0,valoFrete: 0,valorSeguro: 0,valorDesconto: 0,valorIpi: 0,valorPis: 0,valorCofins: 0,valorOutros: 0,valorNotaFiscal: 0,valorAproxTributos: 0}'
     *           http://localhost:8090/notasfiscais
     * 
     * 
     */
    @PostMapping
    public ResponseEntity<Response<String>> salvarTodasNotasFiscais(List<NotaFiscal> notasfiscais) {

        Response<String> response = new Response<String>();

        try {

            List<NotaFiscal> notasfiscaisSalva = this.notafiscalService.salve(notasfiscais);

            if ((notasfiscaisSalva == null) || (notasfiscais.size() == 0)) {
                throw new RuntimeException("Notas fiscais inválida! Não pode ser salva!");
            }

            response.setDados("As notas fiscais foram salvas com sucesso");

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }


}
