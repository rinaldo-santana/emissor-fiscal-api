package com.everest.emissorfiscal.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum StatusNFe {

    INDEFINIDO(0),
    PROCESSADA(103),
    AUTORIZADA(100);

    private Integer codigo;

    public static StatusNFe getCodigo(Integer codigo) {
        for (StatusNFe status : values()) {
            if (status.codigo.equals(codigo)) {
                return status;
            }
        }
		return null;
    }      

}