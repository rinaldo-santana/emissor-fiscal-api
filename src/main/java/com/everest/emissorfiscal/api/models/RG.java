package com.everest.emissorfiscal.api.models;

import com.everest.emissorfiscal.api.models.RegistroEstadual;

import lombok.Getter;

@Getter
public class RG extends RegistroEstadual<String> {

    public RG(String rg) {
        this.setNumero(rg);
        this.valida();
    }

	@Override
	public void valida() {
		
	}


}

// public class RG extends RegistroEstadual {

//     public RG(String rg) {
//         super.setNumero(rg);
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