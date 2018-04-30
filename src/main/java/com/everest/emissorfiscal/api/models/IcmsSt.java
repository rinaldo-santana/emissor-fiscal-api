package com.everest.emissorfiscal.api.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.everest.emissorfiscal.api.enums.CSTIcms;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class IcmsSt {

	@Column(name = "valor_base_icms_st")
	private BigDecimal baseCalculo = BigDecimal.ZERO;

	@Column(name = "percentual_aliquota_debito_icms_st")	
    private BigDecimal aliquotaDebito = BigDecimal.ZERO;
	
	@Column(name = "percentual_aliquota_credito_icms_st")	
    private BigDecimal aliquotaCredito = BigDecimal.ZERO;

	@Column(name = "taxa_valor_agregado_icms_st")	    
    private BigDecimal taxaValorAgregado = BigDecimal.ZERO;

	@Column(name = "valor_icms_st")	
	private BigDecimal valor = BigDecimal.ZERO;

	@Enumerated(EnumType.STRING)
	@Column(name = "cst_icms")	
	private CSTIcms cstIcms = CSTIcms.INDEFINIDO;    
}