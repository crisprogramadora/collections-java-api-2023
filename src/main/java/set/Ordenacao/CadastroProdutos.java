package main.java.set.Ordenacao;

import main.java.set.Ordenacao.Produto.ComparatorPorPreco;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, quantidade, preco, nome));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Xícara", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Tesoura", 20d, 10);
        cadastroProdutos.adicionarProduto(3L, "Abajur", 10d, 2);
        cadastroProdutos.adicionarProduto(1L, "Boné", 20d, 2);
        // não vai cadastrar mais de um prodduto com o mesmo código.

        System.out.println(cadastroProdutos.produtoSet); // exibe todos os produtos

        System.out.println(cadastroProdutos.exibirProdutosPorNome()); //mostra os produtos ordenados pelo nome

        System.out.println(cadastroProdutos.exibirProdutosPorPreco()); //mostra os produtos ordenados pelo preço
    }
}
