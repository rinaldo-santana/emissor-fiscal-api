package com.everest.emissorfiscal.api.controllers;

import java.util.List;

import com.everest.emissorfiscal.api.entities.Cidade;
import com.everest.emissorfiscal.api.response.Response;
import com.everest.emissorfiscal.api.services.CidadeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cidades")
@CrossOrigin("*")
public class CidadeController {

    @Autowired
    CidadeService cidadeService;

    /**
     * @exemple 
     * URL: curl -X POST -d "CodigoIbge=2507507&nome=Joao Pessoa&uf=PB&pais=BRASIL" http://localhost:8090/cidades
     *      curl -i -X POST -H "Content-Type: application/json" -d '{"codigoIbge":"2507507","nome":"Recife","uf":"PE","pais":"BRASIL"}' http://localhost:8090/cidades

     */
    @PostMapping
    public ResponseEntity<Response<String>> salvarCidade(@RequestBody Cidade cidade) {

        Response<String> response = new Response<String>();

        System.out.println(">>Cidade: " + cidade.toString());

        try {

            Cidade cidadeSalva = this.cidadeService.salve(cidade);

            if ((cidadeSalva == null) || ("".equals(cidade.getCodigoIbge()))) {
                throw new RuntimeException("Cidade inválida! Não pode ser salva!");
            }

            response.setDados("A cidade " + cidadeSalva.getNome() + " foi salva com sucesso");

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    /**
     * @exemple
     *  URL: curl  http://localhost:8090/cidades 
     *  return {"ibgeCodigo":"2507507","nome":"Joao Pessoa","uf":"PB","pais":"BRASIL"}
     */
    @GetMapping
    public ResponseEntity<Response<List<Cidade>>> buscarTodasCidades() {

        Response<List<Cidade>> response = new Response<List<Cidade>>();

        try {

            List<Cidade> cidades = this.cidadeService.busqueTodas();
            response.setDados(cidades);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    /**
     * @exemple 
     * URL: curl  http://localhost:8090/cidades/2507507
     * return {"ibgeCodigo":"2507507","nome":"Joao Pessoa","uf":"PB","pais":"BRASIL"}
     */
    @GetMapping("/{id}")
    public ResponseEntity<Response<Cidade>> buscarCidadePorId(@PathVariable("id") String ibgeCodigo) {

        Response<Cidade> response = new Response<Cidade>();

        try {

            Cidade cidade = this.cidadeService.busquePorId(ibgeCodigo);
            response.setDados(cidade);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    /**
     * @exemple
     * URL: curl -X DELETE http://localhost:8090/cidades/2507507
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Response<String>> deletarCidadePorId(@PathVariable("id") String ibgeCodigo) {

        Response<String> response = new Response<String>();

        try {

            cidadeService.deletePorId(ibgeCodigo);
            response.setDados("Cidade excluída com sucesso");

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    /**
     * @exemple
     * add on cidade with UF property wronged. URL:curl -d "ibgeCodigo=2507507&nome=Joao Pessoa&uf=PE&pais=BRASIL" http://localhost:8090/cidades
     * URL: curl -X PUT -d "ibgeCodigo=2507507&nome=Joao Pessoa&uf=PB&pais=BRASIL" http://localhost:8090/cidades
     * return: {"ibgeCodigo":"2507507","nome":"Joao Pessoa","uf":"PB","pais":"BRASIL"}
     */

    @PutMapping
    public ResponseEntity<Response<Cidade>> editarCidade(Cidade cidade) {

        Response<Cidade> response = new Response<Cidade>();

        try {

            Cidade cidadeEditada = this.cidadeService.edite(cidade);
            response.setDados(cidadeEditada);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);

    }
}