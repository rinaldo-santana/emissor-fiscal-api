package com.everest.emissorfiscal.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.everest.emissorfiscal.api.models.Pessoa;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "empresas")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter @Setter
@ToString(callSuper = true)  
@EqualsAndHashCode(callSuper = true, of = {"cnpj"})
@DynamicUpdate @DynamicInsert
public class Empresa extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "inscricao_estadual")
    private String inscricaoEstadual;

  }