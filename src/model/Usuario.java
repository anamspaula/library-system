package model;

public class Usuario {

    private static int sequencialId= 1;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String codigo;

    public Usuario(String nome, String email, String telefone, String cpf) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.codigo = gerarCodigoUsuario();
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCodigo() {
        return codigo;
    }

    // Função para gerar o código do usuário
    private String gerarCodigoUsuario(){
        return "US" + (sequencialId++);

    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", cpf=" + cpf + ", codigo="
                + codigo + "]";
    }

}
