package com.everest.emissorfiscal.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.everest.emissorfiscal.api.enums.Pais;
import com.everest.emissorfiscal.api.enums.UF;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity @Table(name = "cidades")
@Getter @Setter @ToString @EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PUBLIC) 
// @RequiredArgsConstructor(access = AccessLevel.PUBLIC)
@DynamicUpdate @DynamicInsert
public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@Column(name = "cidade_codigo")
	private String codigoIbge;

	@Column(name = "cidade_nome")
	private String nome;

	@Enumerated(EnumType.STRING)
	@Column(name = "cidade_uf")
	private UF uf;

	@Enumerated(EnumType.STRING)
	@Column(name = "cidade_pais")
	private Pais pais;

	
}
