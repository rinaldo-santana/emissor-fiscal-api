package com.everest.emissorfiscal.api.entities;

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
@Table(name = "clientes")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter @Setter
@ToString(callSuper = true)  
@EqualsAndHashCode(callSuper = true, of = {"cadastroNacional"})
@DynamicUpdate @DynamicInsert
public class Cliente extends Pessoa {

    @Column(name = "cadastro_nacional")
    private String cadastroNacional;

    @Column(name = "registro_estadual")
    private String registroEstadual;


}