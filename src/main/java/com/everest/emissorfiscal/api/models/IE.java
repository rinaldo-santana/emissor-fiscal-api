package com.everest.emissorfiscal.api.models;

import com.everest.emissorfiscal.api.models.RegistroEstadual;

import lombok.Getter;

@Getter
public class IE<T> extends RegistroEstadual<T> {

    public IE(T ie) {
        this.setNumero(ie);
        this.valida();
    }


	@Override
	public void valida() {
		
	}


}

// public class IE extends RegistroEstadual {

//     public IE(String ie) {
//         super.setNumero(ie);
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