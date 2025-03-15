package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato contato : contatoSet) {
            if(contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato novoContato = null;

        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                novoContato = contato;
                break;
            }
        }
        return novoContato;
    }

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.exibirContatos();

        contatos.adicionarContato("Cristiane", 995288432);
        contatos.adicionarContato("Aline", 988860447);
        contatos.adicionarContato("Anderson", 988579007);
        contatos.adicionarContato("Ana Luiza", 988124780);

        contatos.exibirContatos();

        System.out.println(contatos.pesquisarPorNome("Cristiane"));

        System.out.println("Contato atualizado: " + contatos.atualizarNumeroContato("Aline", 55555));
    }
}
