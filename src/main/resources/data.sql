INSERT INTO orcamento (nome_cliente, fone_cliente, descricao, valor_total, status, dt_entrada) VALUES
('Vitor Renan', '48 991789462', 'Formataçao sem backup, instalar Windows 10 no NVME novo', 70.00, 'ABERTO', '2025-11-21 07:56:33');

INSERT INTO orcamento (nome_cliente, descricao, valor_total, status) VALUES
('Tomas Turbando', 'Limpeza completa de computador', 100.00, 'FINALIZADO');

INSERT INTO item_orcamento (orcamento_id, nome, quantidade, valor_unit, valor_total) VALUES
(1, 'MAO DE OBRA', 1, 50.00, 50.00),
(1, 'INSTALAÇAO NVME SSD 480GB', 1, 20.00, 20.00),
(2, 'MAO DE OBRA', 1, 100.00, 100.00);