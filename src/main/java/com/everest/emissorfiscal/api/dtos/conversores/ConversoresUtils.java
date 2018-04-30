package com.everest.emissorfiscal.api.dtos.conversores;

import com.everest.emissorfiscal.api.dtos.NotaFiscalDTO;
import com.everest.emissorfiscal.api.entities.NotaFiscal;



public class ConversoresUtils {
	
	/**
	 * Converter de NotaFiscal para NotaFiscalDTO. 
	 * 
	 * @param nota NotaFiscal
	 * @return NotaFiscalDTO
	 */
	public static NotaFiscalDTO converteToNotaFiscalDTO(NotaFiscal nota){
		
//		Endereco enderecoDestino = new Endereco();
//		enderecoDestino.setCodigoPais(nota.getDestinatario().getCidade().getCodigoPais());
//		enderecoDestino.setCep(nota.getDestinatario().getCep());
//		enderecoDestino.setCodigoMunicipio(nota.getDestinatario().getCidade().getCodigoMunicipio());
//		enderecoDestino.setLogradouro(nota.getDestinatario().getLogradouro());
//		enderecoDestino.setBairro(nota.getDestinatario().getBairro().getDescricao());
//		enderecoDestino.setNomeCidade(nota.getDestinatario().getCidade().getDescricao());
//		enderecoDestino.setNomePais(nota.getDestinatario().getCidade().getNomePais());
//		enderecoDestino.setNumero(nota.getDestinatario().getNumero());
//		enderecoDestino.setTelefone(nota.getDestinatario().getTelefone());
//		enderecoDestino.setUf(nota.getDestinatario().getCidade().getUf());
//		
//		Destinatario destinatario = new Destinatario();
//		destinatario.setCnpj(nota.getDestinatario().getCnpj());
//		destinatario.setNome(nota.getDestinatario().getRazaoSocial());
//		destinatario.setInscricaoEstadual(nota.getDestinatario().getInscricaoEstadual());
//		destinatario.setEndereco(enderecoDestino);
//		
//		
//		Identificacao identificacao = new Identificacao();
//		identificacao.setModelo(nota.getId().getModelo());
//		identificacao.setNumero(nota.getId().getNumero());
//		identificacao.setSerie(nota.getId().getSerie());
//		identificacao.setOperacao(nota.getOperacao().getDescricao());
//		identificacao.setDataEmissao(nota.getDataEmissao());
//		identificacao.setDataMovimento(nota.getDataEmissao());
//		
//		
//		Emitente emitente = new Emitente();
//		Endereco enderecoEmitente = new Endereco();
//		enderecoEmitente.setCodigoPais(nota.getId().getEmpresa().getCidade().getCodigoPais());
//		enderecoEmitente.setCep(nota.getId().getEmpresa().getCep());
//		enderecoEmitente.setCodigoMunicipio(nota.getId().getEmpresa().getCidade().getCodigoMunicipio());
//		enderecoEmitente.setLogradouro(nota.getId().getEmpresa().getLogradouro());
//		enderecoEmitente.setBairro(nota.getId().getEmpresa().getBairro().getDescricao());
//		enderecoEmitente.setNomeCidade(nota.getId().getEmpresa().getCidade().getDescricao());
//		enderecoEmitente.setNomePais(nota.getId().getEmpresa().getCidade().getNomePais());
//		enderecoEmitente.setNumero(nota.getId().getEmpresa().getNumero());
//		enderecoEmitente.setTelefone(nota.getId().getEmpresa().getTelefone());
//		enderecoEmitente.setUf(nota.getId().getEmpresa().getCidade().getUf());
//		
//		emitente.setCnpj(nota.getId().getEmpresa().getCnpj());
//		emitente.setNome(nota.getId().getEmpresa().getNome());
//		emitente.setInscricaoEstadual(nota.getId().getEmpresa().getInscricaoEstadual());
//		emitente.setEndereco(enderecoEmitente);
//
//		List<Detalhe> detalhes = new ArrayList<Detalhe>();
//
//		nota.getItems().forEach(item -> {
//
//			Produto produto = new Produto();			
//			produto.setItem(item.getItem());
//			produto.setCodigo(item.getProduto().getCodigo());
//			produto.setDescricao(item.getProduto().getDescricao());
//			produto.setCfop(item.getCfop());
//			produto.setEan(item.getEmbalagem().getEan());
//			produto.setNcm(item.getProduto().getNcm());
//			produto.setUnidade(item.getEmbalagem().getUnidade().getDescricao());
//			produto.setQuantidade(item.getQuantidade());
//			produto.setValorUnitario(item.getValorUnitario());
//			produto.setValorTotal(item.getValorTotal());
//
//			Imposto imposto = new Imposto();
//			Ipi ipi = new Ipi();
//			ipi.setCstNaoTributado(item.getCstIPI());
//		
//			imposto.setIpi(ipi);
//			
//			PisCofins pis = new PisCofins();
//			pis.setCst(item.getCstPIS());
//			pis.setBaseCalculo(item.getBaseCalculoPIS());
//			pis.setAliquota(item.getAliquotaPIS());
//			pis.setValor(item.getValorPIS());
//
//			imposto.setCofins(pis);
//			
//			PisCofins cofins = new PisCofins();
//			cofins.setCst(item.getCstCOFINS());
//			cofins.setBaseCalculo(item.getBaseCalculoCOFINS());
//			cofins.setAliquota(item.getAliquotaCOFINS());
//			cofins.setValor(item.getValorCOFINS());
//			
//			imposto.setPis(cofins);
//					
//			Detalhe detalhe = new Detalhe();
//			detalhe.setProduto(produto);
//			detalhe.setImposto(imposto);
//			
//			detalhes.add(detalhe);
//			
//		});
//		
//		
//		Total total = new Total();
//		total.setValorBaseCalculoICMS(nota.getBaseCalculoIcms());
//		total.setValorICMS(nota.getValorIcms());
//		total.setValorBaseCalculoST(nota.getBaseIcmsSubstituto());
//		total.setValorST(nota.getValorIcmsSubstituto());
//		total.setValorIPI(nota.getValorIPI());
//		total.setValorPIS(nota.getValorPIS());
//		total.setValorCOFINS(nota.getValorCOFINS());
//		total.setValorFrete(nota.getValorFrete());
//		total.setValorSeguro(nota.getValorSeguro());
//		total.setValorOutros(nota.getValorDespesaAcessoria());;
//		total.setValorDesconto(nota.getValorDesconto());
//		total.setValorProdutos(nota.getTotalProdutos());
//		total.setValorNotaFiscal(nota.getValorContabil());
//		total.setValorTotalTributos(null);
		
		
		NotaFiscalDTO dto = new NotaFiscalDTO();
//		dto.setIdentificacao(identificacao);
//		dto.setEmitente(emitente);
//		dto.setDestinatario(destinatario);		
//		dto.setDetalhes(detalhes);
//		dto.setTotal(total);
		
				
		return dto;
	}
	
	/**
	 * Converte de NotaFiscalDTO para uma NotaFiscal
	 * 
	 * @param notaFiscalDTO
	 * @return NotaFiscal 
	 */
	public static NotaFiscal converteToNotaFiscal(NotaFiscalDTO notaFiscalDTO){
		return null;
	}

}
