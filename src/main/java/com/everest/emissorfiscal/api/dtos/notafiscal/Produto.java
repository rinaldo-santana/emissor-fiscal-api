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
@EqualsAndHashCode(of = {"codigo"})
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Produto {
	
	@Column(name = "produto_item")
	private Integer item;

	@Column(name = "produto_codigo")
	private Long codigo;

	@Column(name = "produto_ean")
	private String ean;

	@Column(name = "produto_descricao")
	private String descricao;

	@Column(name = "produto_ncm")
	private String ncm;

	@Column(name = "produto_cfop")
	private String cfop;

	@Column(name = "produto_unidade")
	private String unidade;

	@Column(name = "produto_quantidade")
	private BigDecimal quantidade;

	@Column(name = "produto_valor_unitario")
	private BigDecimal valorUnitario;

	@Column(name = "produto_valor_total")
	private BigDecimal valorTotal;

}
