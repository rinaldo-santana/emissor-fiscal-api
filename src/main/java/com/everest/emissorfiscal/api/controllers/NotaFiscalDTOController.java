package com.everest.emissorfiscal.api.controllers;

import java.util.Date;
import java.util.List;

import com.everest.emissorfiscal.api.dtos.NotaFiscalDTO;
import com.everest.emissorfiscal.api.repositories.NotaFiscalDTODetalheRepository;
import com.everest.emissorfiscal.api.response.Response;
import com.everest.emissorfiscal.api.services.NotafiscalDTOService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emissor-fiscal/importacao/notasfiscais")
@CrossOrigin("*")
public class NotaFiscalDTOController {


	@Autowired
    NotafiscalDTOService notafiscalDTOService;
    
    @Autowired
    NotaFiscalDTODetalheRepository detalheRepository;

    /**     
     * curl localhost:8090/api/emissor-fiscal/importacao/notasfiscais -H 'Content-Type:application/json' -d '[{"identificacao":{"operacao":"VENDA DE MERCADORIA","modelo":"55","serie":"1","numero":30532,"dataEmissao":"2016-02-05","dataMovimento":"2016-02-05"},"emitente":{"cnpj":"12676722000140","nome":"MARTINS E NOBREGA LTDA","endereco":{"logradouro":"RUA DOM PREDO II","numero":"788","bairro":"CENTRO","codigoMunicipio":"2510808","nomeCidade":"PATOS","uf":"PB","cep":"58700-180","codigoPais":"1058","nomePais":"BRASIL","telefone":"8334213775"},"inscricaoEstadual":"160460166"},"destinatario":{"cnpj":"47873639487","nome":"MARIA CARNEIRO DA SILVA SOUZA","endereco":{"logradouro":"R PADRE MANOEL OTAVIANO","numero":"SN","bairro":"CENTRO","codigoMunicipio":"2502607","nomeCidade":"IGARACY","uf":"PB","cep":"58775000","codigoPais":"1058","nomePais":"BRASIL","telefone":"83  34801192"},"inscricaoEstadual":""},"detalhes":[{"produto":{"item":1,"codigo":161,"ean":"0004630000027","descricao":"FT SUPREMA 50KG","ncm":"11010010","cfop":"5.403","unidade":"UN","quantidade":4.0000,"valorUnitario":108.0000,"valorTotal":432.00000000},"imposto":{"valorTotalTributos":null,"icms":null,"ipi":{"cstNaoTributado":"53"},"pis":{"cst":"06","baseCalculo":0.00,"aliquota":0.00,"valor":0.00},"cofins":{"cst":"06","baseCalculo":0.00,"aliquota":0.00,"valor":0.00}}}],"total":{"valorBaseCalculoICMS":0.00,"valorICMS":0.00,"valorBaseCalculoST":0.00,"valorST":0.00,"valorProdutos":432.00,"valorFrete":0.00,"valorSeguro":0.00,"valorDesconto":0.00,"valorIPI":0.00,"valorPIS":0.00,"valorCOFINS":0.00,"valorOutros":0.00,"valorNotaFiscal":432.00,"valorTotalTributos":null}}]'
     * 
     */
	@PostMapping()
    public ResponseEntity<Response<String>> salvarTodasNotasFiscais(@RequestBody List<NotaFiscalDTO> dtos) {

        Response<String> response = new Response<String>();

        try {

            List<NotaFiscalDTO> notas = this.notafiscalDTOService.salve(dtos);

            if ((notas == null) || (notas.size() == 0)) {
                throw new RuntimeException("Notas fiscais inválida! Não pode ser salva!");
            }

            response.setDados("As notas fiscais foram salvas com sucesso");

        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<Response<List<NotaFiscalDTO>>> buscarTodasNotasFiscais() {

        Response<List<NotaFiscalDTO>> response = new Response<List<NotaFiscalDTO>>();

        try {

            List<NotaFiscalDTO> result = this.notafiscalDTOService.busqueTodas();
            response.setDados(result);
            
        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/emissao", params = {"inicio", "fim"})
    public ResponseEntity<Response<List<NotaFiscalDTO>>> buscarNotasFiscaisPorEmissaoEntre(
        @Param("inicio") Date dataInicial, @Param("fim") Date dataFinal ) {

        Response<List<NotaFiscalDTO>> response = new Response<List<NotaFiscalDTO>>();

        try {

            List<NotaFiscalDTO> result = this.notafiscalDTOService.busquePorEmissaoEntre(dataInicial, dataFinal);
            response.setDados(result);
            
        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response<NotaFiscalDTO>> buscarNotaFiscal(@PathVariable Long id ) {

        Response<NotaFiscalDTO> response = new Response<NotaFiscalDTO>();

        try {

            NotaFiscalDTO result = this.notafiscalDTOService.busquePorId(id);
            response.setDados(result);
            
        } catch (Exception e) {
            response.getErros().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        return ResponseEntity.ok(response);
    }    
    

}
