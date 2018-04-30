package com.everest.emissorfiscal.api.models;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CNPJ extends CadastroNacional {

    public CNPJ(String cnpj) {
        this.setNumero(cnpj);
        this.valida();
    }

    @Override
    public void valida() {

	}


}

// public class CNPJ extends CadastroNacional {

//     public CNPJ(String cnpj) {
//         super.setNumero(cnpj);
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