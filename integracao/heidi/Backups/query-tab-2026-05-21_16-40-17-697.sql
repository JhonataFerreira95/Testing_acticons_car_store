-- Cria o banco de dados se não existir
CREATE DATABASE IF NOT EXISTS loja_carro_db;
USE loja_carro_db;

-- Cria a tabela carro
CREATE TABLE carro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    modelo VARCHAR(100) NOT NULL,
    ano INT,
    valor DOUBLE (10, 2)
);