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
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Total {
	
	@Column(name = "total_valor_base_icms")
	private BigDecimal valorBaseCalculoICMS;

	@Column(name = "total_valor_icms")
	private BigDecimal valorICMS;

	@Column(name = "total_valor_base_icms_st")
	private BigDecimal valorBaseCalculoST;

	@Column(name = "total_valor_icms_st")
	private BigDecimal valorST;

	@Column(name = "total_valor_produtos")
	private BigDecimal valorProdutos;

	@Column(name = "total_valor_frete")
	private BigDecimal valorFrete;

	@Column(name = "total_valor_seguro")
	private BigDecimal valorSeguro;

	@Column(name = "total_valor_desconto")
	private BigDecimal valorDesconto;

	@Column(name = "total_valor_ipi")
	private BigDecimal valorIPI;

	@Column(name = "total_valor_pis")
	private BigDecimal valorPIS;

	@Column(name = "total_valor_cofins")
	private BigDecimal valorCOFINS;

	@Column(name = "total_valor_outros")
	private BigDecimal valorOutros;

	@Column(name = "total_valor_nota_fiscal")
	private BigDecimal valorNotaFiscal;

	@Column(name = "total_valor_aprox_tributos")
	private BigDecimal valorTotalTributos;
	
}
