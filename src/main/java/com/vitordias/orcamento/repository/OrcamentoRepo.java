package com.vitordias.orcamento.repository;

import com.vitordias.orcamento.model.Orcamento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrcamentoRepo implements GenericRepo<Orcamento, Long> {
    private final JdbcTemplate jdbc;

    @Autowired
    public OrcamentoRepo(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Orcamento buscarPorId(Long id) {
        String sql = "";
        Orcamento orcamento = jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Orcamento.class), id);
        return orcamento;
    }

    @Override
    public List<Orcamento> buscarTodos() {
        String sql = "";
        List<Orcamento> orcamentos = jdbc.query(sql, new BeanPropertyRowMapper<>(Orcamento.class));
        return orcamentos;
    }

    @Override
    public long incluir(Orcamento orcamento){
        String sql = "";
        return jdbc.update(sql);
    }

    @Override
    public int atualizar(Orcamento orcamento) {
        String sql = "";
        return jdbc.update(sql);
    }

    // ADICIONAR AS QUERYS SQL
}