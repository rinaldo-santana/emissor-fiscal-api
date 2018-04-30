package com.everest.emissorfiscal.api.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notasfiscais")
@CrossOrigin("*")
public class NotaFiscalDTOController1 {

	@Value("${host.url}")
	private String url;

	// @Autowired
	// private NotaFiscalRepository notaFiscalRepository;



	// @PostMapping("/importacao")
	// public void salvar(@RequestBody List<NotaFiscalDTO> notasFiscaisDTO) {
	// 	notasFiscaisDTO.forEach( nota -> {
	// 		notaFiscalRepository.save(nota);
	// 	});
	// }

	// @GetMapping
	// public List<NotaFiscal> todas(){
	// 	return notaFiscalRepository.findAll();
	// }

	// @GetMapping("/carga/{codigo}")
	// public Integer contarPorCarga(Integer codigo) {
	// 	return notaFiscalRepository.countByCarga(codigo);
	// }

	// @SuppressWarnings("unchecked")
	// @GetMapping("/carga/{cargaId}")
	// public ResponseEntity<Response<List<NotaFiscalDto>>> buscarPorCarga(@PathVariable("cargaId") Long cargaId, 
	// 		HttpServletRequest req) throws JsonParseException, JsonMappingException, IOException {

	// 	String urlLocal = this.url +  req.getRequestURI();

	// 	Response<List<NotaFiscalDto>> response = new Response<List<NotaFiscalDto>>();
	// 	response.setDados(new ArrayList<NotaFiscalDto>());

	// 	RestTemplate restTemplate = new RestTemplate();	
	// 	List<Map<String,NotaFiscalDto>> result =  restTemplate.getForObject(urlLocal, List.class);

	// 	Gson gson = new Gson();
	// 	result.forEach(nota -> {response.getDados().add(gson.fromJson(nota.toString(), NotaFiscalDto.class));});

	// 	return ResponseEntity.ok().body(response);

	// }

}
