package Pesquisa;

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
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 462098);
        agendaContatos.adicionarContato("Patricia", 974034);
        agendaContatos.adicionarContato("Camila", 7480);
        agendaContatos.adicionarContato("Camila Dalva", 4678601);
        agendaContatos.adicionarContato("Noemia Santos", 462102);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
        System.out.println(agendaContatos.pesquisarPorNome("Patricia"));
        System.out.println("Contato atualizado: "
                + agendaContatos.atualizarNumeroContato
                ("Noemia Santos", 784061));
        agendaContatos.exibirContatos();
    }
}