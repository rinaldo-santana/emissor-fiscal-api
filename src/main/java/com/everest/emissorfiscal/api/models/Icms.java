package com.everest.emissorfiscal.api.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.everest.emissorfiscal.api.enums.CSTIcms;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Icms {

	@Column(name = "valor_base_icms")
	private BigDecimal baseCalculo = BigDecimal.ZERO;

	@Column(name = "percentual_aliquota_icms")	
    private BigDecimal aliquota = BigDecimal.ZERO;
	
	@Column(name = "valor_base_icms")	
	private BigDecimal valor = BigDecimal.ZERO;

	@Enumerated(EnumType.STRING)
	@Column(name = "cst_icms")	
	private CSTIcms cstIcms = CSTIcms.INDEFINIDO; 
}