package com.everest.notafiscal.api.response;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {
	
	private T dados;
	private List<String> erros;
	
	
	public Response() {
		this.erros = new ArrayList<String>();
	}



	public T getDados() {
		return dados;
	}

	public void setDados(T dados) {
		this.dados = dados;
	}

	public List<String> getErros() {
		return this.erros;
	}


	public void setErros(List<String> erros) {
		this.erros = erros;
	}

	
	

}
