package com.everest.emissorfiscal.api.dtos.notafiscal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter @Setter
@ToString @EqualsAndHashCode(of = {"cnpj"})
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Destinatario {
	
	@Column(name = "dest_cnpj")
	private String cnpj;

	@Column(name = "dest_nome")
	private String nome;

	@Column(name = "dest_inscricao_estadual")
	private String inscricaoEstadual;		

	@Embedded
	private EnderecoDestinatario endereco;

	
}
