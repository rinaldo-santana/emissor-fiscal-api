package com.everest.emissorfiscal.api.controllers;

import com.everest.emissorfiscal.api.entities.Cliente;
import com.everest.emissorfiscal.api.response.Response;
import com.everest.emissorfiscal.api.services.ClienteService;
import java.util.List;
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
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClienteController {


    @Autowired
    ClienteService clienteService;

    /**
     * @exemple 
     * URL: curl -X POST -d "nome=Marcos&cadastroNacional=97757764491" http://localhost:8090/clientes
          * curl -X POST -d "nome=Manoel&cadastroNacional=97757764491&cidade.codigoIbge=2507507&telefones=8388572907,8399572908" http://localhost:8090/clientes
     */    
    @PostMapping
    public ResponseEntity<Response<String>> salvarCidade(Cliente cliente) {

        Response<String> response = new Response<String>();

        try {

            Cliente clienteSalvo = this.clienteService.salve(cliente);

            if ((clienteSalvo == null) || (clienteSalvo.getId() == null)) {
                throw new RuntimeException("Cliente inválido! Não pode ser salvo!");
            }

            response.setDados("O cliente " + clienteSalvo.getNome() + " foi salvo com sucesso");

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    /**
     * @exemple 
     * URL: curl http://localhost:8090/clientes
     *  
     */   
    @GetMapping
    public ResponseEntity<Response<List<Cliente>>> buscarTodosClientes() {

        Response<List<Cliente>> response = new Response<List<Cliente>>();

        try {

            List<Cliente> clientes = this.clienteService.busqueTodas();
            response.setDados(clientes);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    } 

    @GetMapping("/{id}")
    public ResponseEntity<Response<Cliente>> buscarClientePorId(@PathVariable("id") Long id) {

        Response<Cliente> response = new Response<Cliente>();

        try {

            Cliente cidade = this.clienteService.busquePorId(id);
            response.setDados(cidade);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response<String>> deletarClientePorId(@PathVariable("id") Long id) {

        Response<String> response = new Response<String>();

        try {

            clienteService.deletePorId(id);
            response.setDados("Cliente excluída com sucesso");

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }


    @PutMapping
    public ResponseEntity<Response<Cliente>> editarCidade(Cliente cliente) {

        Response<Cliente> response = new Response<Cliente>();

        try {

            Cliente clienteEditado = this.clienteService.edite(cliente);
            response.setDados(clienteEditado);

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);

    }

}