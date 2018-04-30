package com.everest.emissorfiscal.api.dtos.notafiscal;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode(of = {"modelo", "serie", "numero", "dataEmissao"})
public class Identificacao {
	
	@Column(name = "ide_operacao")
	private String operacao;

	@Column(name = "ide_modelo")
	private String modelo;
	
	@Column(name = "ide_serie")
	private String serie;

	@Column(name = "ide_numero")
	private Long numero;

	@Column(name = "ide_data_emissao")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEmissao;

	@Column(name = "ide_data_movimento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataMovimento;


}
