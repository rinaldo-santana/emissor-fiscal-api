package com.everest.emissorfiscal.api;

import com.everest.emissorfiscal.api.controllers.NotaFiscalController;
import com.everest.emissorfiscal.api.dtos.NotaFiscalDTO;
import com.everest.emissorfiscal.api.dtos.notafiscal.Icms;
import com.everest.emissorfiscal.api.entities.NotaFiscal;
import com.everest.emissorfiscal.api.repositories.NotaFiscalRepository;
import com.everest.emissorfiscal.api.services.NotaFiscalService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(basePackageClasses = { Jsr310JpaConverters.class, 
			NotaFiscal.class,NotaFiscalDTO.class, Icms.class,NotaFiscalController.class, 
			NotaFiscalRepository.class, NotaFiscalService.class })

@SpringBootApplication
@Profile(value = "dev")
public class EmissorFiscalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmissorFiscalApiApplication.class, args);

		System.out.println(">>>>>>>>>>>> Ok Ok Ok...");

		// Icms icms = new Icms();
		// icms.setAliquota(new BigDecimal("18"));
		// icms.setBaseCalculo(new BigDecimal("100.25"));
		// icms.setValor( icms.getBaseCalculo().multiply(icms.getAliquota()).divide(BigDecimal.TEN.pow(2)).setScale(2, RoundingMode.HALF_DOWN) ) ;
		// icms.setCstIcms(CSTIcms.ICMS00);

		// System.out.println(">>> icms: " + icms.toString() );

		// CNPJ cnpj = new CNPJ("08225255255");
		// cnpj.setNumero("08.225.255/-25");

		// Cliente clientePJ = new Cliente();
		// clientePJ.setNome("Rinaldo PJ");
		// clientePJ.setCadastroNacional(cnpj.toString());
		// clientePJ.setRegistroEstadual("1612312399");
		
		// System.out.println("\nclientePJ: " + clientePJ.toString());

		// Cliente clientePF = new Cliente();
		// clientePF.setNome("Rinaldo PJ");
		// clientePF.setCadastroNacional("97757764491");
		// clientePF.setRegistroEstadual("\nclientePF: " + clientePF.toString());

		// NotaFiscal notafiscal = new NotaFiscal();
		// notafiscal.setNumero(new BigInteger("25145"));
		// notafiscal.setModelo(ModeloDocumentoFiscal.NFE);
		// notafiscal.setCliente(clientePJ);
		// notafiscal.setDataEmissao(new Date());

		// CPF cpf = new CPF("97757764491");
		// System.out.println("\n>>> CPF: " + cpf);
		// CNPJ cnpj = new CNPJ("08125145000191");
		// System.out.println("\n>>>> CNPJ:" + cnpj);

		// RG rg = new RG("1848352");
		// System.out.println("\n>>> RG: " + rg);
		// IE ie = new IE("1624585247");
		// System.out.println("\n>>>> IE:" + ie );

		// Cliente c = new Cliente();
	
		

		// System.out.println("\n>>>> notafiscal PJ: " + notafiscal.toString());


	}

	// @Bean
	// public CommandLineRunner commandLineRunner(){

	// 		return x -> {

	// 		try{
	// 			//Inicia As Configurações
	// 			//Para Mais informações: https://github.com/Samuel-Oliveira/Java_NFe/wiki/Configura%C3%A7%C3%B5es-Nfe
	// 			ConfiguracoesIniciaisNfe config = iniciaConfigurações();

	// 			TConsCad consCad = new TConsCad();
	// 			consCad.setVersao("2.00");

	// 			InfCons infCons = new InfCons();
	// 			infCons.setCNPJ("02290016000101");
	// //			 infCons.setCPF("97757764491"); //Caso Seja CPF
	// 			infCons.setXServ("CONS-CAD");
	// 			infCons.setUF(TUfCons.valueOf(config.getEstado().toString()));

	// 			consCad.setInfCons(infCons);

	// 			TRetConsCad retorno = Nfe.consultaCadastro(consCad, true);

	// 			if(retorno.getInfCons().getCStat().equals("111")){
	// 				System.out.println("Razão Social: "+retorno.getInfCons().getInfCad().get(0).getXNome());
	// 				System.out.println("Cnpj:"+retorno.getInfCons().getInfCad().get(0).getCNPJ());
	// 				System.out.println("Ie:"+retorno.getInfCons().getInfCad().get(0).getIE());
	// 			}else{
	// 				System.err.println(retorno.getInfCons().getCStat()+" - " +retorno.getInfCons().getXMotivo());
	// 			}

	// 		} catch (NfeException e) {
	// 			System.out.println(e.getMessage());
	// 		}

	// 			   try {
	// 					//Inicia As Configurações
	// 					//Para Mais informações: https://github.com/Samuel-Oliveira/Java_NFe/wiki/Configura%C3%A7%C3%B5es-Nfe
	// 					ConfiguracoesIniciaisNfe config = iniciaConfigurações();

	// 					TConsSitNFe consSitNFe = new TConsSitNFe();
	// 					consSitNFe.setVersao(config.getVersaoNfe());
	// 					consSitNFe.setTpAmb(config.getAmbiente());
	// 					consSitNFe.setXServ("CONSULTAR");
	// 			        //Substitua os X Pela Chave que deseja Consultar
	// 					consSitNFe.setChNFe("");

	// 					//Informe false para não fazer a validação do XML - Ganho De tempo.	
	// 					TRetConsSitNFe retorno = Nfe.consultaXml(consSitNFe,false,ConstantesUtil.NFE);
	// 					System.out.println("Status:" + retorno.getCStat());
	// 					System.out.println("Motivo:" + retorno.getXMotivo());
	// 					System.out.println("Data:" + retorno.getProtNFe().getInfProt().getDhRecbto());

	// 					//Transforma O ProtNfe do Retorno em XML
	// 					String xmlProtNfe = XmlUtil.objectToXml(retorno.getProtNFe());
	// 					System.out.println(xmlProtNfe);

	// 				} catch (NfeException | JAXBException e) {
	// 					System.out.println("Erro:" + e.getMessage());
	// 				}			

	// 			   try {
	// 					//Inicia As Configurações
	// 					//Para Mais informações: https://github.com/Samuel-Oliveira/Java_NFe/wiki/Configura%C3%A7%C3%B5es-Nfe
	// 					ConfiguracoesIniciaisNfe config = iniciaConfigurações();

	// 					TConsStatServ consStatServ = new TConsStatServ();
	// 					consStatServ.setTpAmb(config.getAmbiente());
	// 					consStatServ.setCUF(config.getEstado().getCodigoIbge());
	// 					consStatServ.setVersao(config.getVersaoNfe());
	// 					consStatServ.setXServ("STATUS");

	// 					//Informe false para não fazer a validação do XML - Ganho De tempo.
	// 					TRetConsStatServ retorno = Nfe.statusServico(consStatServ,false, ConstantesUtil.NFE);
	// 					System.out.println("Status:" + retorno.getCStat());
	// 					System.out.println("Motivo:" + retorno.getXMotivo());
	// 					System.out.println("Data:" + retorno.getDhRecbto());

	// 				} catch (NfeException e) {
	// 					System.out.println("Erro:" + e.getMessage());
	// 				}

	// 		};

	// }

	// public static ConfiguracoesIniciaisNfe iniciaConfigurações() throws NfeException {
	// 	// Certificado Arquivo, Parametros: -Caminho Certificado, - Senha
	// 	Certificado certificado = CertificadoUtil.certificadoPfx("/home/rinaldo/Documentos/certificados-digitais/saco-limpo-rj-2018.pfx", "123456");

	// 	return ConfiguracoesIniciaisNfe.iniciaConfiguracoes(
	// 		Estados.RJ , 
	// 		ConstantesUtil.AMBIENTE.HOMOLOGACAO,
	// 		certificado, 
	// 		"/home/rinaldo/workspace/projetos-nfe4/projetos-emissor-fiscal/emissor-fiscal-api/docs/Schemas", 
	// 		ConstantesUtil.VERSAO.V3_10);
	// }

	//	
	//	private ConfiguracoesIniciaisNfe iniciaConfigurações() {
	//		
	// Estados estado = Estados.RJ;
	// String ambiente = AMBIENTE.HOMOLOGACAO;
	//		Certificado certificado = new Certificado();
	//		certificado.setArquivo("/home/rinaldo/Documentos/certificados-digitais/saco-limpo-rj-2018.pfx");
	//		certificado.setSenha("123456");
	//		String pastaSchemas = "/home/rinaldo/workspace/agileata-api/emissor-fiscal-api/docs/Schemas";
	//		String versaoNfe = "3.10";
	//		
	//		return ConfiguracoesIniciaisNfe.iniciaConfiguracoes(estado, ambiente, certificado, pastaSchemas, versaoNfe) ;
	//	
	//
	//	}

}
