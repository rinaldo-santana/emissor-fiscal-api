package com.everest.emissorfiscal.api.models;

import java.util.Date;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.everest.emissorfiscal.api.entities.Cidade;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter @Setter @ToString @EqualsAndHashCode(of = {"id"})
public abstract class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_nascimento")
	private Date dataNascimento;

	@Column(name = "endereco_logradouro")
	private String logradouro;

	@Column(name = "endereco_numero")
	private String numero;

	@Column(name = "endereco_cep")
	private String cep;

	@Column(name = "endereco_complemento")
	private String complemento;

	@Column(name = "endereco_bairro")
	private String bairro;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "endereco_codigo_cidade") 
	private Cidade cidade;

	@Column(name = "endereco_ponto_referencia")
	private String pontoReferencia;   	
	

	@ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
	@CollectionTable(name = "pessoas_telefones", joinColumns = {@JoinColumn(name = "pessoa_id")})
	@Column(name = "telefone")
	private Set<String> telefones;

	@ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
	@CollectionTable(name = "pessoas_emails", joinColumns = {@JoinColumn(name = "pessoa_id")})
	@Column(name = "email")	
    private Set<String> emails;

}