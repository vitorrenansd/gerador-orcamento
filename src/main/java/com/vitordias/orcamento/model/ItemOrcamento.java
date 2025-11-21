package com.vitordias.orcamento.model;

import java.math.BigDecimal;

public class ItemOrcamento {
    private Integer id;
    private Integer orcamentoId;
    
    private String nome;
    private Integer quantidade;
    private BigDecimal valorUnit;
    private BigDecimal valorTotal;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrcamentoId() {
        return orcamentoId;
    }
    public void setOrcamentoId(Integer orcamentoId) {
        this.orcamentoId = orcamentoId;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnit() {
        return valorUnit;
    }
    public void setValorUnit(BigDecimal valorUnit) {
        this.valorUnit = valorUnit;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}