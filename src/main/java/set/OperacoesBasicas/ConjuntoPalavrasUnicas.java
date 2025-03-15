package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }
    //Adiciona uma palavra ao conjunto.
    public void adicionarPalavra(String palavra) {
        palavraSet.add(new Palavra(palavra));
    }
    //Remove uma palavra do conjunto.
    public void removerPalavra(String palavra) {
        Palavra palavraParaRemover = null;

        for(Palavra p : palavraSet) {
            if (p.getPalavraUnica().equalsIgnoreCase(palavra)) {
                palavraParaRemover = p;
                break;
            }
        }
        palavraSet.remove(palavraParaRemover);
    }
    //Verifica se uma palavra está presente no conjunto.
    public Set<Palavra> verificarPalavra(String palavra) {
        Set<Palavra> palavraVerificada = new HashSet<Palavra>();

        for (Palavra p : palavraSet) {
            if(p.getPalavraUnica().startsWith(palavra)) {
                palavraVerificada.add(p);
            }
        }
        return palavraVerificada;
    }
    //Exibe todas as palavras únicas do conjunto.
    public void exibirPalavrasUnicas() {
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Paralelepípedo");
        conjuntoPalavrasUnicas.adicionarPalavra("Ornitorrinco");
        conjuntoPalavrasUnicas.adicionarPalavra("Otorrinolaringologista");
        conjuntoPalavrasUnicas.adicionarPalavra("Paralelepípedo");//não vai adicionar palavra que já existe no conjunto
        conjuntoPalavrasUnicas.adicionarPalavra("Inconstitucionalissimamente");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Caracol"));

        conjuntoPalavrasUnicas.removerPalavra("Ornitorrinco");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
