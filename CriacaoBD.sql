CREATE DATABASE greenbook;

USE greenbook;

--Criando tabela usuario
CREATE TABLE usuario(
  `id_usuario` INT PRIMARY KEY AUTO_INCREMENT,
  `login_usuario` VARCHAR(20) NOT NULL,
  `senha_usuario` VARCHAR(20) NOT NULL,
  `nome_usuario` VARCHAR(40),
  `sexo_usuario` VARCHAR(10),
  `idade_usuario` INT,
  `tipo_usuario` VARCHAR(20) NOT NULL,
  `email_usuario` VARCHAR(100),
  `estado_usuario` VARCHAR(10),
  `cidade_usuario` VARCHAR(20),
  `rua_usuario` VARCHAR(60)
);

--Criando tabela livro
CREATE TABLE livro (
  `id_livro` INT NOT NULL AUTO_INCREMENT,
  `nome_livro` VARCHAR(45) NOT NULL,
  `autor_livro` VARCHAR(45) NOT NULL,
  `genero_livro` VARCHAR(45) NOT NULL,
  `imagem_livro` VARCHAR(400) NOT NULL,
  `id_usuario` INT NOT NULL,
  PRIMARY KEY (`id_livro`)
  );

  --Criando tabela livro nota
CREATE TABLE livro_nota (
  `id_nota` INT NOT NULL AUTO_INCREMENT,
  `id_livro` INT NOT NULL,
  `id_usuario` INT NOT NULL,
  `nota_livro` FLOAT NOT NULL,
  PRIMARY KEY (`id_nota`));

  --Criando tabela livro favorito
  CREATE TABLE livro_favorito (
  `id_favorito` INT NOT NULL AUTO_INCREMENT,
  `id_usuario` INT NOT NULL,
  `id_livro` INT NOT NULL,
  PRIMARY KEY (`id_favorito`));