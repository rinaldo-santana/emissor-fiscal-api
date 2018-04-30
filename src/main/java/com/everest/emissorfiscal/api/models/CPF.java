package com.everest.emissorfiscal.api.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CPF extends CadastroNacional{

    public CPF(String cpf) {
        this.setNumero(cpf);
        this.valida();
    }

	@Override
	public void valida() {
		
    }
    
    @Override
    public String toString() {
        return this.getNumero();
    }

}

// public class CPF extends CadastroNacional {

//     public CPF(String cpf) {
//         super.setNumero(cpf);
//         this.valida();
//     }

// 	@Override
// 	public void valida() {

//     }
    
//     @Override
//     public String toString() {
//         return super.getNumero();
//     }


// }