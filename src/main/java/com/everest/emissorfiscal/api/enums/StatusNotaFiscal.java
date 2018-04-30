package com.everest.emissorfiscal.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum StatusNotaFiscal {

    INDEFINIDO("Indefinido"),
    DIGITADA("Digitada"),
    AUTORIZADA("Autorizada");

    private String descricao;

}
