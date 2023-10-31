CREATE DATABASE greenbook;

CREATE TABLE usuario(
id_usuario INT PRIMARY KEY AUTO_INCREMENT,
login_usuario VARCHAR(10) NOT NULL,
senha_usuario VARCHAR(10) NOT NULL,
nome_usuario VARCHAR(20) NOT NULL,
sexo_usuario VARCHAR(10) NOT NULL,
idade_usuario INT NOT NULL,
email_usuario VARCHAR(30),
estado_usuario VARCHAR(20),
cidade_usuario VARCHAR(20),
rua_usuario VARCHAR(20),
numero_usuario INT
);