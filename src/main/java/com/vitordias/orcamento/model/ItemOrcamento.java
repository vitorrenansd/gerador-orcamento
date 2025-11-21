package com.vitordias.orcamento.model;

import java.math.BigDecimal;

public class ItemOrcamento {
    private Integer id;
    private Integer orcamentoId;
    
    private String nome;
    private Integer quantidade;
    private BigDecimal valorUnit;
    private BigDecimal valorTotal;
}