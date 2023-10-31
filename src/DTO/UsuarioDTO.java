package DTO;

/*
 * @author Gustavo Moreno
 */

public class UsuarioDTO {
    
    private int id_usuario, idade_usuario, numero_usuario;
    private String login_usuario, senha_usuario, nome_usuario, sexo_usuario, email_usuario, estado_usuario, cidade_usuario, rua_usuario;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getLogin_usuario() {
        return login_usuario;
    }

    public void setLogin_usuario(String login_usuario) {
        this.login_usuario = login_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
    
    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }
    
    public String getSexo_usuario() {
        return sexo_usuario;
    }

    public void setSexo_usuario(String sexo_usuario) {
        this.sexo_usuario = sexo_usuario;
    }

    public int getIdade_usuario() {
        return idade_usuario;
    }

    public void setIdade_usuario(int idade_usuario) {
        this.idade_usuario = idade_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(String estado_usuario) {
        this.estado_usuario = estado_usuario;
    }
    
    public String getCidade_usuario() {
        return cidade_usuario;
    }

    public void setCidade_usuario(String cidade_usuario) {
        this.cidade_usuario = cidade_usuario;
    }

    public String getRua_usuario() {
        return rua_usuario;
    }

    public void setRua_usuario(String rua_usuario) {
        this.rua_usuario = rua_usuario;
    }

    public int getNumero_usuario() {
        return numero_usuario;
    }

    public void setNumero_usuario(int numero_usuario) {
        this.numero_usuario = numero_usuario;
    }
}