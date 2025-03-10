package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private final List<Numeros> numeroslist;

    public SomaNumeros() {
        this.numeroslist = new ArrayList<>();
    }

    public void adicionarNumero(Integer numeros) {

        numeroslist.add(new Numeros(numeros));
    }

    public void exibirNumeros() {
        System.out.println("Lista: ");

        for (Numeros numeros : numeroslist) {
            System.out.println(numeros.getNumeros());
        }
    }

    public Integer calcularSoma() {
        Integer valorTotal = 0;
        for (Numeros numeros : numeroslist) {
            valorTotal += numeros.getNumeros();
        }
        return valorTotal;
    }

    public Integer encontrarMaiorNumero() {
        Integer maiorNumero = 0;

        if (!numeroslist.isEmpty()) {
            for (Numeros numeros : numeroslist) {
                if (numeros.getNumeros() > maiorNumero) {
                    maiorNumero = numeros.getNumeros();
                }
            }
        }
        return maiorNumero;
    }

    public Integer encontrarMenorNumero() {
        Integer menorNumero = 1000;
        for(Numeros numeros : numeroslist) {
            if (numeros.getNumeros() < menorNumero) {
                menorNumero = numeros.getNumeros();
            }
        }
        return menorNumero;

    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(1);
        soma.adicionarNumero(9);
        soma.adicionarNumero(2);
        soma.adicionarNumero(7);

        soma.exibirNumeros();

        Integer valorTotal = soma.calcularSoma();
        System.out.println("O valor total é: " + valorTotal);

        Integer maiorNumero = soma.encontrarMaiorNumero();
        System.out.println("O maior número da lista é: " + maiorNumero);

        Integer menorNumero = soma.encontrarMenorNumero();
        System.out.println("O menor número da lista é: " + menorNumero);
    }
}
