CREATE DATABASE IF NOT EXISTS a3_controle_de_estoque;

USE a3_controle_de_estoque;


CREATE TABLE IF NOT EXISTS Categoria (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45),
    tamanho VARCHAR(45),
    embalagem VARCHAR(45)
);


CREATE TABLE IF NOT EXISTS Produto (
    id_produto INT AUTO_INCREMENT PRIMARY KEY,
    id_categoria INT NOT NULL,

    nome VARCHAR(45),
    preco_unitario DECIMAL(10,2),
    unidade VARCHAR(45),

    qntd_estoque INT,
    qntd_min_estoque INT,
    qntd_max_estoque INT,

    CONSTRAINT fk_produto_categoria
    FOREIGN KEY (id_categoria)
    REFERENCES Categoria(id_categoria)
);
    
    


CREATE TABLE IF NOT EXISTS Movimentacao (
    id_movimentacao INT AUTO_INCREMENT PRIMARY KEY,
    id_produto INT NOT NULL,

    data DATE,
    quantidade INT,

    tipo ENUM('ENTRADA', 'SAIDA'),

    CONSTRAINT fk_movimentacao_produto
    FOREIGN KEY (id_produto)
    REFERENCES Produto(id_produto)
);

SELECT * FROM MOVIMENTACAO;
SELECT * FROM PRODUTO;
SELECT * FROM CATEGORIA;

