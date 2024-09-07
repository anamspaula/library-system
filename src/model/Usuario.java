package model;

import utils.CodigoUtil;

public class Usuario {

    private String nome;
    private String usuario;
    private String email;
    private String cpf;
    private String senha;
    private Integer codigo;

    public Usuario(String nome, String usuario, String email, String cpf, String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
        this.codigo = CodigoUtil.gerarCodigoUsuario();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
}
