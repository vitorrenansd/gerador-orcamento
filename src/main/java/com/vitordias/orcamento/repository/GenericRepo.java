package com.vitordias.orcamento.repository;

import java.util.List;

public interface GenericRepo<T, ID> {

    T buscarPorId(ID id);

    List<T> buscarTodos();

    long salvar(T entidade);

    int atualizar(T entidade);
}