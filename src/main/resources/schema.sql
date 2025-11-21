CREATE TABLE orcamento (
    id IDENTITY PRIMARY KEY,

    nome_cliente VARCHAR(40) NOT NULL,
    fone_cliente VARCHAR(20),
    email_cliente VARCHAR(80),

    descricao VARCHAR(255),
    valor_total NUMERIC(10,2),
    status VARCHAR(20) NOT NULL DEFAULT 'ABERTO',

    dt_entrada TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    dt_saida TIMESTAMP
);

CREATE TABLE itens_orcamento (
    id IDENTITY PRIMARY KEY,
    orcamento_id BIGINT NOT NULL,

    nome VARCHAR(60) NOT NULL,
    quantidade INT NOT NULL DEFAULT 1,
    valor_unit NUMERIC(10,2) NOT NULL,
    valor_total NUMERIC(10,2) NOT NULL,

    CONSTRAINT fk_orcamento
        FOREIGN KEY (orcamento_id)
        REFERENCES orcamento(id)
        ON DELETE CASCADE
);