package com.everest.emissorfiscal.api.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class RegistroEstadual<T> {

    private T numero;
    
    public void valida() {

	}
}