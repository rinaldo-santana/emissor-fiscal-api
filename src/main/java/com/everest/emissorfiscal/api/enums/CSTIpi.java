package com.everest.emissorfiscal.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor 
public enum CSTIpi {


// 00 – Entrada com Recuperação de Crédito
// 01 – Entrada Tributada com Alíquota Zero
// 02 – Entrada Isenta
// 03 – Entrada Não Tributada
// 04 – Entrada Imune
// 05 – Entrada com Suspensão
// 49 – Outras Entradas

// 50 – Saída Tributada
// 51 – Saída Tributável com Alíquota Zero
// 52 – Saída Isenta
// 53 – Saída Não Tributada
// 54 – Saída Imune
// 55 – Saída com Suspensão
// 99 – Outras Saídas    

    INDEFINIDO("","Indefinido"),
    IPI00("00", "Entrada com Recuperação de Crédito"),
    IPI01("01", "Entrada Tributada com Alíquota Zero"),
    IPI02("02", "Entrada Isenta"),
    IPI03("03", "Entrada Não Tributada"),
    IPI04("04", "Entrada Imune"),
    IPI05("05", "Entrada com Suspensão"),
    IPI49("49", "Outras Entradas"),

    IPI50("50", "Saída Tributada"),
    IPI51("51", "Saída Tributável com Alíquota Zero"),
    IPI52("52", "Saída Isenta"),
    IPI53("53", "Saída Não Tributada"),
    IPI54("54", "Saída Imune"),
    IPI55("55", "Saída com Suspensão"),
    IPI99("99", "Outras Saídas");

    private String codigo;
    private String descricao;

    public static CSTIpi getCodigo(String codigo) {
        for (CSTIpi cst : values()) {
            if (cst.codigo.equals(codigo)) {
                return cst;
            }
        }
		return null;
    }  
  

}