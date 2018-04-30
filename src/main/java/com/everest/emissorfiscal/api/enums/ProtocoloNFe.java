package com.everest.emissorfiscal.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProtocoloNFe {

    AUTORIZADA(100, "Autorizada");

    private Integer codigo;
    private String descricao;

    public static ProtocoloNFe getCodigo(Integer codigo) {
        for (ProtocoloNFe protocolo : values()) {
            if (protocolo.codigo.equals(codigo)) {
                return protocolo;
            }
        }
		return null;
    } 
}