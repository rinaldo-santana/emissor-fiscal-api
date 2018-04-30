package com.everest.emissorfiscal.api.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.everest.emissorfiscal.api.dtos.notafiscal.Destinatario;
import com.everest.emissorfiscal.api.dtos.notafiscal.Detalhe;
import com.everest.emissorfiscal.api.dtos.notafiscal.Emitente;
import com.everest.emissorfiscal.api.dtos.notafiscal.Identificacao;
import com.everest.emissorfiscal.api.dtos.notafiscal.Total;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "importacao_nota_fiscal")
@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString @EqualsAndHashCode(of = {"identificacao"})
public class NotaFiscalDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter
	private Long id;

	@Embedded
	@Setter 
	private Identificacao identificacao;
	
	@Embedded
	@Setter 
	private Emitente emitente;

	@Embedded
	@Setter
	private Destinatario destinatario;

	@Getter @Setter
	@OneToMany
	@JoinColumn(name = "notafiscal_id")
	private List<Detalhe> detalhes = new ArrayList<Detalhe>();

	@Embedded
	@Setter 
	private Total total;

	// public List<Detalhe> getDetalhes() {
	// 	// List<Detalhe> listaSegura = Collections.unmodifiableList(this.detalhe);
	// 	return this.detalhes;
	// }

	// public void adiciona(Detalhe detalhe) {
	// 	// this.detalhes.add(detalhe);
	// 	// detalhe.setNotafiscal(null);
	// }
	
	// public void remover(Detalhe detalhe) {
	// 	this.detalhes.remove(detalhe);
	// 	// detalhe.setNotafiscal(null);
	// }
	

}
