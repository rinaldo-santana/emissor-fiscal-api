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
public class Pis {
	
	@Column(name = "imposto_pis_cst")
	private String cst;

	@Column(name = "imposto_pis_base_calculo")
	private BigDecimal baseCalculo;

	@Column(name = "imposto_pis_aliquota")
	private BigDecimal aliquota;

	@Column(name = "imposto_pis_valor")
	private BigDecimal valor;
	
}
