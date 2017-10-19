package com.everest.notafiscal.api.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.everest.notafiscal.api.dto.NotaFiscalDto;
import com.everest.notafiscal.api.entities.NotaFiscal;
import com.everest.notafiscal.api.repositories.NotaFiscalRepository;
import com.everest.notafiscal.api.response.Response;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.Gson;



@RestController
@RequestMapping("/notasfiscais")
@CrossOrigin("*")
public class NotaFiscalResource {
	
	@Value("${host.url}")
	private String url;
	
	@Autowired
	private NotaFiscalRepository notaFiscalRepository;
	
	
/*	@GetMapping
	public List<NotaFiscal> todas(){
		return notaFiscalRepository.findAll();
	}*/
/*
	@GetMapping("/carga/{codigo}")
	public Integer contarPorCarga(Integer codigo) {
		return notaFiscalRepository.countByCarga(codigo);
	}*/
	
	@PostMapping
	public void salvar(@RequestBody NotaFiscal notaFiscal) {	
		notaFiscalRepository.save(notaFiscal);
	}
	

	@SuppressWarnings("unchecked")
	@GetMapping("/carga/{cargaId}")
	public ResponseEntity<Response<List<NotaFiscalDto>>> buscarPorCarga(@PathVariable("cargaId") Long cargaId, HttpServletRequest req) throws JsonParseException, JsonMappingException, IOException {
		String urlLocal = this.url +  req.getRequestURI();
		
		Response<List<NotaFiscalDto>> response = new Response<List<NotaFiscalDto>>();
		response.setDados(new ArrayList<NotaFiscalDto>());
		
		RestTemplate restTemplate = new RestTemplate();	
		List<Map<String,NotaFiscalDto>> result =  restTemplate.getForObject(urlLocal, List.class);
		
		Gson gson = new Gson();
		result.forEach(nota -> {response.getDados().add( gson.fromJson(nota.toString() , NotaFiscalDto.class));});
	
		return ResponseEntity.ok().body(response);
		
	}
	
	

	
}
