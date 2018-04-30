package com.everest.emissorfiscal.api.dtos.notafiscal;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter @Setter @ToString
@EqualsAndHashCode(of = {"cst", "baseCalculo", "aliquota", "valor"})
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Ipi {
	
	@Column(name = "imposto_ipi_cst")
	private String cst;

	@Column(name = "imposto_ipi_base_calculo")
	private BigDecimal baseCalculo;

	@Column(name = "imposto_ipi_aliquota")
	private BigDecimal aliquota;

	@Column(name = "imposto_ipi_valor")
	private BigDecimal valor;
	
}
