package com.everest.emissorfiscal.api.dtos.notafiscal;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString 
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(exclude = {"valorTotalTributos"})
public class Imposto {
	
	@Column(name = "imposto_valor_aprox_tributos")
	private BigDecimal valorTotalTributos;

	@Embedded
	private Icms icms;

	@Embedded
	private Ipi ipi;

	@Embedded
	private Pis pis;

	@Embedded
	private Cofins cofins;

	
}
