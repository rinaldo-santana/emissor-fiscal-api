package com.everest.emissorfiscal.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum CSTCofins {

    INDEFINIDO("","Indefinido"),
    COFINS01("01", "Operação Tributável com Alíquota Básica"),
    COFINS02("02", "Operação Tributável com Alíquota Diferenciada"),
    COFINS03("03", "Operação Tributável com Alíquota por Unidade de Medida de Produto"),
    COFINS04("04", "Operação Tributável Monofásica - Revenda a Alíquota Zero"),
    COFINS05("05", "Operação Tributável por Substituição Tributária"),
    COFINS06("06", "Operação Tributável a Alíquota Zero"),
    COFINS07("07", "Operação Isenta da Contribuição"),
    COFINS08("08", "Operação sem Incidência da Contribuição"),
    COFINS09("09", "Operação com Suspensão da Contribuição"),
    COFINS49("49", "Outras Operações de Saída"),
    COFINS50("50", "Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno"),
    COFINS51("51", "Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno"),
    COFINS52("52", "Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação"),
    COFINS53("53", "Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno"),
    COFINS54("54", "Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação"),
    COFINS55("55", "Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação"),
    COFINS56("56", "Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação"),
    COFINS60("60", "Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno"),
    COFINS61("61", "Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno"),
    COFINS62("62", "Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação"),
    COFINS63("63", "Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno"),
    COFINS64("64", "Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação"),
    COFINS65("65", "Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação"),
    COFINS66("66", "Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação"),
    COFINS67("67", "Crédito Presumido - Outras Operações"),
    COFINS70("70", "Operação de Aquisição sem Direito a Crédito"),
    COFINS71("71", "Operação de Aquisição com Isenção"),
    COFINS72("72", "Operação de Aquisição com Suspensão"),
    COFINS73("73", "Operação de Aquisição a Alíquota Zero"),
    COFINS74("74", "Operação de Aquisição sem Incidência da Contribuição"),
    COFINS75("75", "Operação de Aquisição por Substituição Tributária"),
    COFINS98("98", "Outras Operações de Entrada"),
    COFINS99("99", "Outras Operações");

    private String codigo;
    private String descricao;

    public static CSTCofins getCodigo(String codigo) {
        for (CSTCofins cst : values()) {
            if (cst.codigo.equals(codigo)) {
                return cst;
            }
        }
		return null;
    }  

}