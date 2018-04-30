package com.everest.emissorfiscal.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.everest.emissorfiscal.api.enums.ModeloDocumentoFiscal;
import com.everest.emissorfiscal.api.enums.ProtocoloNFe;
import com.everest.emissorfiscal.api.enums.StatusNotaFiscal;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Table(name = "notas_fiscais")
@Getter @Setter  @ToString 
@EqualsAndHashCode(of = {"empresa", "numero", "serie", "modelo"})
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@DynamicUpdate @DynamicInsert
public class NotaFiscal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @Enumerated(EnumType.STRING)
    @Column(name = "modelo")
    private ModeloDocumentoFiscal modelo;

    @Column(name = "serie")
    private Integer serie;

    @Column(name = "numero")
    private BigInteger numero;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_emissao")
    private Date dataEmissao;

    @Temporal(TemporalType.TIME)
    @Column(name = "hora_emissao")
    private Date horaEmissao;

    @OneToOne
    @JoinColumn(name = "natureza_operacao_id")
    private NaturezaOperacao naturezaOoperacao;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(name = "chave_eletronica")
    private String chaveEletronica;

    @Enumerated(EnumType.STRING)
    @Column(name = "protocolo_nfe_id")
    private ProtocoloNFe protocoloNfe;

    @Enumerated(EnumType.STRING)
    private StatusNotaFiscal status;

    @Column(name = "carga_numero")
    private Long carga;

    @Column(name = "valor_base_icms")
    private BigDecimal valorBaseIcms;

    @Column(name = "valor_icms")
    private BigDecimal valorIcms;

    @Column(name = "valor_base_icms_st")
    private BigDecimal valorBaseIcmsST;

    @Column(name = "valor_icms_st")
    private BigDecimal valorIcmsST;

    @Column(name = "valor_produtos")
    private BigDecimal valorProdutos;

    @Column(name = "valor_frete")
    private BigDecimal valoFrete;

    @Column(name = "valor_seguro")
    private BigDecimal valorSeguro;

    @Column(name = "valor_desconto")
    private BigDecimal valorDesconto;

    @Column(name = "valor_ipi")
    private BigDecimal valorIpi;

    @Column(name = "valor_pis")
    private BigDecimal valorPis;

    @Column(name = "valor_cofins")
    private BigDecimal valorCofins;

    @Column(name = "valor_outros")
    private BigDecimal valorOutros;

    @Column(name = "valor_nota_fiscal")
    private BigDecimal valorNotaFiscal;

    @Column(name = "valor_aprox_tributos")
    private BigDecimal valorAproxTributos;

}
