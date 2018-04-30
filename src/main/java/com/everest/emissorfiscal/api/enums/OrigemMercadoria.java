package com.everest.emissorfiscal.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum OrigemMercadoria { 


    //Fonte: Nota Técnica 2013/006 http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=6/BAt3jI3yk=
    // 0 - Nacional, exceto as indicadas nos códigos 3, 4, 5 e 8;
    // 1 - Estrangeira - Importação direta, exceto a indicada no código 6;
    // 2 - Estrangeira - Adquirida no mercado interno, exceto a indicada no código 7;
    // 3 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40% e inferior ou igual a 70%;
    // 4 - Nacional, cuja produção tenha sido feita em conformidade com os processos produtivos básicos de que tratam as legislações citadas nos Ajustes;
    // 5 - Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou igual a 40%;
    // 6 - Estrangeira - Importação direta, sem similar nacional, constante em lista da CAMEX e gás natural;
    // 7 - Estrangeira - Adquirida no mercado interno, sem similar nacional, constante em lista da CAMEX e gás natural.
    // 8 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70%;    


    INDEFINIDO("","Indefinido"),
    ZERO  ("0", "Nacional, exceto as indicadas nos códigos 3, 4, 5 e 8"),
    UM    ("1", "Estrangeira - Importação direta, exceto a indicada no código 6"),
    DOIS  ("2", "Estrangeira - Adquirida no mercado interno, exceto a indicada no código 7"),
    TRES  ("3", "Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40% e inferior ou igual a 70%"),
    QUATRO("4", "Nacional, cuja produção tenha sido feita em conformidade com os processos produtivos básicos de que tratam as legislações citadas nos Ajustes SINIEF mencionados na Nota Técnica 2013/006"),
    CINCO ("5", "Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou igual a 40%"),
    SEIS  ("6", "Estrangeira - Importação direta, sem similar nacional, constante em lista da CAMEX e gás natural"),    
    SETE  ("7", "Estrangeira - Adquirida no mercado interno, sem similar nacional, constante em lista da CAMEX e gás natural"),
    OITO  ("8", "Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70%");    

    private String codigo;    
    private String descricao ;

    public static OrigemMercadoria getCodigo(String codigo) {
        for (OrigemMercadoria origem : values()) {
            if (origem.codigo.equals(codigo)) {
                return origem;
            }
        }
		return null;
    }  
    

}