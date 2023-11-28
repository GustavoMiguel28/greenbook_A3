package DTO;

/*
 * @author Gustavo Moreno
 */

public class LivroDTO {
    
    private int id_livro, qtd_notas;
    private String nome_livro, autor_livro, genero_livro, imagem_livro;
    private double nota_livro;

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getAutor_livro() {
        return autor_livro;
    }

    public void setAutor_livro(String autor_livro) {
        this.autor_livro = autor_livro;
    }

    public String getGenero_livro() {
        return genero_livro;
    }

    public void setGenero_livro(String genero_livro) {
        this.genero_livro = genero_livro;
    }
    
    public String getImagem_livro() {
        return imagem_livro;
    }

    public void setImagem_livro(String imagem_livro) {
        this.imagem_livro = imagem_livro;
    }
    
    public int getQtd_notas() {
        return qtd_notas;
    }
    public void setQtd_notas(int qtd_notas) {
        this.qtd_notas = qtd_notas;
    }
    
    public double getNota_livro() {
        return nota_livro;
    }
    public void setNota_livro(double nota_livro) {
        this.nota_livro = nota_livro;
    }
   
}
