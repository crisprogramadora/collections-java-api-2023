package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade) {

        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(item);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }

    public Double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item item : itemList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println("Itens no carrinho: ");

        for (Item item : itemList) {
            System.out.println("Produto: " + item.getNome() + ", Preço: R$" + item.getPreco() + ", Quantidade: " + item.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Camiseta", 50.0, 2);
        carrinho.adicionarItem("Calça", 120.0, 1);
        carrinho.adicionarItem("Tênis", 250.0, 1);

        carrinho.exibirItens();

        Double valorTotal = carrinho.calcularValorTotal();
        System.out.println("Valor total do carrinho: R$" + valorTotal);

        carrinho.removerItem("");

    }
}
