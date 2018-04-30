package com.everest.emissorfiscal.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum ModeloDocumentoFiscal {

    NFE("55", "Nota fiscal eletronica"),
    NFCE("65", "Nota fiscal do consumidor eletronica");

    private String codigo;
    private String descricao;

    public static ModeloDocumentoFiscal getCodigo(String codigo) {
        for (ModeloDocumentoFiscal modelo : values()) {
            if (modelo.codigo.equals(codigo)) {
                return modelo;
            }
        }
		return null;
    }     
}