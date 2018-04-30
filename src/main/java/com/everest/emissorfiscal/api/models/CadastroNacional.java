package com.everest.emissorfiscal.api.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class CadastroNacional {

    @Getter @Setter
    private String numero;

    public void valida() {

	}
}