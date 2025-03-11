package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numeros> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(Integer numeros) {
        numerosList.add(new Numeros(numeros));
    }

    public List<Numeros> ordenarAscendente() {
        List<Numeros> ordemAscendente = new ArrayList<>(numerosList);
        Collections.sort(ordemAscendente);
        return ordemAscendente;
    }

    public List<Numeros> ordenarDescendente() {
        List<Numeros> ordemDescendente = new ArrayList<>(numerosList);
        ordemDescendente.sort(Collections.reverseOrder());
        return ordemDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(50);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(18);
        ordenacaoNumeros.adicionarNumero(38);
        ordenacaoNumeros.adicionarNumero(14);
        ordenacaoNumeros.adicionarNumero(43);
        ordenacaoNumeros.adicionarNumero(5);

        System.out.println(ordenacaoNumeros.numerosList);
        System.out.print(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
