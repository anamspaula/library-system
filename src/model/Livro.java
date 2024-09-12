package model;

import utils.CodigoGerador;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private LivroStatus status;
    private int anoPublicacao;
    private Integer codigo;

    public Livro(String titulo, String autor, String isbn, int anoPublicacao) {
        this.titulo  = titulo;
        this.autor  = autor ;
        this.isbn = isbn;
        this.status = LivroStatus.DISPONIVEL;
        this.anoPublicacao = anoPublicacao;
        this.codigo = CodigoGerador.gerarCodigoLivro();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LivroStatus getStatus() {
        return status;
    }

    public void setStatus(LivroStatus status) {
        this.status = status;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    // Função que verifica a disponibilidade de empréstimo do livro
    public void emprestar(Livro livro){
        if(this.status == LivroStatus.DISPONIVEL){
            System.out.println("O livro " + getTitulo() + " está disponível!");
            setStatus(LivroStatus.EMPRESTADO);
        } else {
            throw new IllegalStateException("O livro já está emprestado.");
        }
    }

  public void devolver(Livro livro){
    if(this.status == LivroStatus.EMPRESTADO){
        System.out.println("O livro foi devolvido com sucesso!");
        setStatus(LivroStatus.DISPONIVEL);
    } else {
        throw new IllegalStateException("O livro não pode ser devolvido porque não está emprestado.");
    }
  }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", status=" + status + ", anoPublicacao="
                + anoPublicacao + ", codigo=" + codigo + "]";
    }

}
