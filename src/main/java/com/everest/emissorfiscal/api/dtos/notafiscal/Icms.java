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
@EqualsAndHashCode(of = {"cst", "origem", "baseCalculo", "aliquota", "valor"})
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Icms {
	
	@Column(name = "imposto_icms_cst")
	private String cst;

	@Column(name = "imposto_icms_origem")
	private String origem;
	
	@Column(name = "imposto_icms_base_calculo")
	private BigDecimal baseCalculo;

	@Column(name = "imposto_icms_aliquota")
	private BigDecimal aliquota;

	@Column(name = "imposto_icms_valor")
	private BigDecimal valor;

	@Column(name = "imposto_icms_percentual_reducao")
	private BigDecimal percentualReducaoBaseCalculo;
	
	@Column(name = "imposto_icms_mva_st")
	private BigDecimal mvaST;

	@Column(name = "imposto_icms_base_calculo_st")
	private BigDecimal baseCalculoST;

	@Column(name = "imposto_icms_aliquota_st")
	private BigDecimal aliquotaST;

	@Column(name = "imposto_icms_valor_st")
	private BigDecimal valorST;

	@Column(name = "imposto_icms_percentual_reducao_st")
	private BigDecimal percentualReducaoBaseCalculoST;
		
}

