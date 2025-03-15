package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //se tentar adicionar mais de um contato com o mesmo nome, só vai adicionar, o métod put adiciona e atualiza, portanto, vai aparecer o que foi adicionado por último.

        agendaContatos.adicionarContato("Cristiane", 947586950);
        agendaContatos.adicionarContato("Anderson", 629049585);
        agendaContatos.adicionarContato("Kathleen", 98958575);
        agendaContatos.adicionarContato("Ana", 995659580);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Cristiane");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Ana"));

    }
}
