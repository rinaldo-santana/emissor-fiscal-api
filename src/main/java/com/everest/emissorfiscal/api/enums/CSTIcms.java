package com.everest.emissorfiscal.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor 
public enum CSTIcms {

    // 00 - Tributada integralmente
    // 10 - Tributada  e com cobrança do ICMS por substituição tributária
    // 20 - Com redução de base de cálculo
    // 30 - Isenta ou não tributada e com cobrança do ICMS por substituição tributária
    // 40 - Isenta
    // 41 - Não tributada
    // 50 - Suspensão
    // 51 - Diferimento
    // 60 - ICMS cobrado anteriormente por substituição tributária
    // 70 - Com redução de base de cálculo e cobrança de ICMS por substituição tributária
    // 90 - Outras”

    INDEFINIDO("","Indefinido"),
    ICMS00("00", "Tributada integralmente"),
    ICMS10("10", "Tributada  e com cobrança do ICMS por substituição tributária"),
    ICMS20("20", "Com redução de base de cálculo"),
    ICMS30("30", "Isenta ou não tributada e com cobrança do ICMS por substituição tributária"),
    ICMS40("40", "Isenta"),
    ICMS41("41", "Não tributada"),
    ICMS50("50", "Suspensão"),
    ICMS51("51", "Diferimento"),
    ICMS60("60", "ICMS cobrado anteriormente por substituição tributária"),
    ICMS70("70", "Com redução de base de cálculo e cobrança de ICMS por substituição tributária"),
    ICMS90("90", "Outras”");    
    
    private String codigo;
    private String descricao;

	public static CSTIcms getCodigo(String codigo) {
        for (CSTIcms cst : values()) {
            if (cst.codigo.equals(codigo)) {
                return cst;
            }
        }
		return null;
    }  
  

}
