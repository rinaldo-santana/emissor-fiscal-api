package com.everest.emissorfiscal.api.models;

import java.math.BigDecimal;

import javax.persistence.Column;

import com.everest.emissorfiscal.api.enums.CSTIpi;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Ipi  {

    @Column(name = "valor_base_ipi")
    private BigDecimal baseCalculo = BigDecimal.ZERO;

    @Column(name = "percentual_aliquota_ipi")
    private BigDecimal aliquota = BigDecimal.ZERO;

    @Column(name = "valor_ipi")
    private BigDecimal valor = BigDecimal.ZERO;
    
    @Column(name = "cst_ipi")
    private CSTIpi cst = CSTIpi.INDEFINIDO;    
}