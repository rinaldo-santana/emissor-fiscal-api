package com.everest.emissorfiscal.api.dtos.notafiscal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter @Setter
@ToString 
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class EnderecoEmitente {

	@Column(name = "emit_endereco_logradouro")
	private String logradouro;

	@Column(name = "emit_endereco_numero")
	private String numero;

	@Column(name = "emit_endereco_bairro")
	private String bairro;

	@Column(name = "emit_endereco_codigo_municipio")
	private String codigoMunicipio;

	@Column(name = "emit_endereco_nome_cidade")
	private String nomeCidade;

	@Column(name = "emit_endereco_uf")
	private String uf;

	@Column(name = "emit_endereco_cep")
	private String cep;

	@Column(name = "emit_endereco_codigo_pais")
	private String codigoPais;

	@Column(name = "emit_endereco_nome_pais")
	private String nomePais;

	@Column(name = "emit_endereco_telefone")
	private String telefone;
	

	
}
