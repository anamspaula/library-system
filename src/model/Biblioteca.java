package model;

import java.util.List;

public class Biblioteca {

    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca(List<Livro> livros, List<Usuario> usuarios) {
        this.livros = livros;
        this.usuarios = usuarios;
    }

    // Função para adicionar livros
    public void adicionar(Livro livro){
        livros.add(livro);
    }
    
    // Função para adicionar livros
    public void adicionar(Usuario usuario){
        usuarios.add(usuario);
    }

    // Faz a pesquisa por titulo
    public Livro pesquisarTitulo(String titulo){
        for(Livro livro : livros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }

        return null;
    }

    // Faz a pesquisa por autor
    public Livro pesquisarAutor(String autor){
        for(Livro livro : livros){
            if(livro.getAutor().equalsIgnoreCase(autor)){
                return livro;
            }
        }

        return null;
    }

    // Faz a pesquisa por nome de usuário
    public Usuario pesquisarNome(String nome){
        for(Usuario usuario : usuarios){
            if(usuario.getNome().equalsIgnoreCase(nome)){
                return usuario;
            }
        }

        return null;
    }

}
