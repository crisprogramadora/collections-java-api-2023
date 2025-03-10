package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, Integer anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(Integer anoInicial, Integer anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal ) {
                    livrosPorIntervalo.add(livro);
                }
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;

        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = livro;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }
    // mesmo se tiver mais de um livro com o mesmo título, vai mostrar apenas o que foi adicionado primeiro


    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        livros.adicionarLivro("Se liga Garota! Moda, Meninos e Maquiagem ", "Priscila Laranjeira ", 2013);
        livros.adicionarLivro("DEUS, Me Sinto Como a Cinderela! ", "Luanne Mast ", 2022);
        livros.adicionarLivro("Se liga Garota!, Sonhos, Segredos e Sucessos ", "Priscila Laranjeira ", 2018);
        livros.adicionarLivro("Se liga Garota! Amor, Amizade... Amassos? ", "Priscila Laranjeira ", 2012);
        livros.adicionarLivro("As Crônicas de Nárnia ", "C. S. Lewis ", 2006);
        livros.adicionarLivro("O Pequeno Príncipe ", "Antoine de Saint-Exupéry ", 2020);

        System.out.println(livros.pesquisarPorAutor("Priscila Laranjeira "));

        System.out.println(livros.pesquisarPorIntervaloAnos(2006, 2013));

        System.out.println(livros.pesquisarPorTitulo("Se liga Garota! Amor, Amizade... Amassos? "));
    }
}