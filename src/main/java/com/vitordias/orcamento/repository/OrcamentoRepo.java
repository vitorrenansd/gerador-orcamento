package com.vitordias.orcamento.repository;

import com.vitordias.orcamento.model.Orcamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrcamentoRepo implements GenericRepo<Orcamento, Long> {
    private final JdbcTemplate jdbc;

    @Autowired
    public OrcamentoRepo(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}