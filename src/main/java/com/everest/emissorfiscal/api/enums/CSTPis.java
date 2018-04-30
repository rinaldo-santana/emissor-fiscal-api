package com.everest.emissorfiscal.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum CSTPis {

    // 01  Operação Tributável com Alíquota Básica
    // 02  Operação Tributável com Alíquota Diferenciada
    // 03  Operação Tributável com Alíquota por Unidade de Medida de Produto
    // 04  Operação Tributável Monofásica - Revenda a Alíquota Zero
    // 05  Operação Tributável por Substituição Tributária
    // 06  Operação Tributável a Alíquota Zero
    // 07  Operação Isenta da Contribuição
    // 08  Operação sem Incidência da Contribuição
    // 09  Operação com Suspensão da Contribuição
    // 49  Outras Operações de Saída
    // 50  Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno
    // 51  Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno
    // 52  Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação
    // 53  Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno
    // 54  Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação
    // 55  Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação
    // 56  Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação
    // 60  Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno
    // 61  Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno
    // 62  Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação
    // 63  Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno
    // 64  Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação
    // 65  Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação
    // 66  Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação
    // 67  Crédito Presumido - Outras Operações
    // 70  Operação de Aquisição sem Direito a Crédito
    // 71  Operação de Aquisição com Isenção
    // 72  Operação de Aquisição com Suspensão
    // 73  Operação de Aquisição a Alíquota Zero
    // 74  Operação de Aquisição sem Incidência da Contribuição
    // 75  Operação de Aquisição por Substituição Tributária
    // 98  Outras Operações de Entrada
    // 99  Outras Operações

   
    INDEFINIDO("","Indefinido"),
    PIS01("01", "Operação Tributável com Alíquota Básica"),
    PIS02("02", "Operação Tributável com Alíquota Diferenciada"),
    PIS03("03", "Operação Tributável com Alíquota por Unidade de Medida de Produto"),
    PIS04("04", "Operação Tributável Monofásica - Revenda a Alíquota Zero"),
    PIS05("05", "Operação Tributável por Substituição Tributária"),
    PIS06("06", "Operação Tributável a Alíquota Zero"),
    PIS07("07", "Operação Isenta da Contribuição"),
    PIS08("08", "Operação sem Incidência da Contribuição"),
    PIS09("09", "Operação com Suspensão da Contribuição"),
    PIS49("49", "Outras Operações de Saída"),
    PIS50("50", "Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno"),
    PIS51("51", "Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno"),
    PIS52("52", "Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação"),
    PIS53("53", "Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno"),
    PIS54("54", "Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação"),
    PIS55("55", "Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação"),
    PIS56("56", "Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação"),
    PIS60("60", "Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno"),
    PIS61("61", "Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno"),
    PIS62("62", "Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação"),
    PIS63("63", "Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno"),
    PIS64("64", "Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação"),
    PIS65("65", "Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação"),
    PIS66("66", "Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação"),
    PIS67("67", "Crédito Presumido - Outras Operações"),
    PIS70("70", "Operação de Aquisição sem Direito a Crédito"),
    PIS71("71", "Operação de Aquisição com Isenção"),
    PIS72("72", "Operação de Aquisição com Suspensão"),
    PIS73("73", "Operação de Aquisição a Alíquota Zero"),
    PIS74("74", "Operação de Aquisição sem Incidência da Contribuição"),
    PIS75("75", "Operação de Aquisição por Substituição Tributária"),
    PIS98("98", "Outras Operações de Entrada"),
    PIS99("99", "Outras Operações");
    

    private String codigo;
    private String descricao;

    public static CSTPis getCodigo(String codigo) {
        for (CSTPis cst : values()) {
            if (cst.codigo.equals(codigo)) {
                return cst;
            }
        }
		return null;
    }  
    

}