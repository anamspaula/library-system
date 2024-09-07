package model;

import java.util.List;

public class Biblioteca {

    private List<Livro> livros;
    private List<Aluno> alunos;

    public Biblioteca(List<Livro> livros, List<Aluno> alunos) {
        this.livros = livros;
        this.alunos = alunos;
    }

    // Função para adicionar livros
    public void adicionar(Livro livro){
        livros.add(livro);
    }
    
    // Função para adicionar livros
    public void adicionar(Aluno aluno){
        alunos.add(aluno);
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
    public Aluno pesquisarNome(String nome){
        for(Aluno aluno : alunos){
            if(aluno.getNome().equalsIgnoreCase(nome)){
                return aluno;
            }
        }

        return null;
    }

    // Método para emprestar livro
    public void emprestarLivro (Livro livro){
        livro.emprestar(livro);
    }

    // Método para devolver livro
    public void devolverLivro(Livro livro){
        livro.devolver(livro);
    }

    // Método para listar livros
    public String listarLivro(){
        StringBuilder listaDeLivros = new StringBuilder();
        for(Livro livro : livros){
            listaDeLivros.append(livro.getTitulo()).append("\n");
        }
        return listaDeLivros.toString();
    }

    // Método para listar usuários
    public String listarUsuario(){
        StringBuilder listaDeAlunos = new StringBuilder();
        for(Aluno aluno : alunos){
            listaDeAlunos.append(aluno.getNome()).append("\n");
        }
        return listaDeAlunos.toString();
    }
}
