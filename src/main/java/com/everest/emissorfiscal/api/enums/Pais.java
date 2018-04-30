package com.everest.emissorfiscal.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum Pais {
	INDEFINIDO(0),
	BRASIL(1058);

	private Integer codigo;	
	
    public static Pais getCodigo(Integer codigo) {
        for (Pais pais : values()) {
            if (pais.codigo.equals(codigo)) {
                return pais;
            }
        }
		return null;
    }  
}
