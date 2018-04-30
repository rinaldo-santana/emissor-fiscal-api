package com.everest.emissorfiscal.api.dtos.notafiscal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter @Setter 
@ToString @EqualsAndHashCode(of = {"cnpj"})
public class Emitente {
	
	@Column(name = "emit_cnpj")
	private String cnpj;

	@Column(name = "emit_nome")
	private String nome;

	@Column(name = "emit_inscricao_estadual")
	private String inscricaoEstadual;

	@Embedded
	private EnderecoEmitente endereco;	
	
}
