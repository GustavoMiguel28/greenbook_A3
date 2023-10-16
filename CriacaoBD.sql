CREATE DATABASE greenbook;

CREATE TABLE tb_login(
id_usuario INT PRIMARY KEY AUTO_INCREMENT,
login VARCHAR(20) NOT NULL,
senha VARCHAR(20) NOT NULL
);

INSERT INTO tb_login (login, senha) VALUES ('admin', 'senha123');