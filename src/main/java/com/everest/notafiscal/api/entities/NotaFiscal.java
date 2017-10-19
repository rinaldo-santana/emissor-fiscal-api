package com.everest.notafiscal.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notafiscal")
public class NotaFiscal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private Long numero;
	private String serie;
	private String modelo;
	private BigDecimal valorProdutos;
	private BigDecimal valorContabil;
	private Integer carga;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public BigDecimal getValorProdutos() {
		return valorProdutos;
	}
	public void setValorProdutos(BigDecimal valorProdutos) {
		this.valorProdutos = valorProdutos;
	}
	public BigDecimal getValorContabil() {
		return valorContabil;
	}
	public void setValorContabil(BigDecimal valorContabil) {
		this.valorContabil = valorContabil;
	}
	public Integer getCarga() {
		return carga;
	}
	public void setCarga(Integer carga) {
		this.carga = carga;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotaFiscal other = (NotaFiscal) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "NotaFiscal [ id=" + id + ", numero=" + numero + ", serie=" + serie + ", modelo=" + modelo
				+ ", valorProdutos=" + valorProdutos + ", valorContabil=" + valorContabil + ", carga=" + carga + "]";
	}
	
	
	
	
}
