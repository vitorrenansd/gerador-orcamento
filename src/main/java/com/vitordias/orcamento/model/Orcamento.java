package com.vitordias.orcamento.model;

import com.vitordias.orcamento.model.enums.StatusOrcamento;

import java.util.List;
import java.time.LocalDateTime;
import java.math.BigDecimal;

public class Orcamento {
    private Integer id;

    private String nomeCliente;
    private String foneCliente;
    private String emailCliente;

    private List<ItemOrcamento> itens;
    private String descricao;
    private BigDecimal valorTotal;
    private StatusOrcamento status;

    private LocalDateTime dtEntrada;
    private LocalDateTime dtSaida;

    // Getters e setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFoneCliente() {
        return foneCliente;
    }
    public void setFoneCliente(String foneCliente) {
        this.foneCliente = foneCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public List<ItemOrcamento> getItens() {
        return itens;
    }
    public void setItens(List<ItemOrcamento> itens) {
        this.itens = itens;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public StatusOrcamento getStatus() {
        return status;
    }
    public void setStatus(StatusOrcamento status) {
        this.status = status;
    }

    public LocalDateTime getDtEntrada() {
        return dtEntrada;
    }
    public void setDtEntrada(LocalDateTime dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public LocalDateTime getDtSaida() {
        return dtSaida;
    }
    public void setDtSaida(LocalDateTime dtSaida) {
        this.dtSaida = dtSaida;
    }
}