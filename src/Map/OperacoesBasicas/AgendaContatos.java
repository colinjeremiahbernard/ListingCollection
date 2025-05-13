package Map.OperacoesBasicas;

import Pesquisa.Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome) {

        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato( "Marcia Polgada", 6152487);
        agendaContatos.adicionarContato( "Marcia Toledo", 954326);
        agendaContatos.adicionarContato( "Marcia", 7581395);
        agendaContatos.adicionarContato( "Patricia", 236894);
        agendaContatos.adicionarContato( "Marcia Leal", 675807);
        agendaContatos.adicionarContato( "Marcia Bundao", 6789287);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Marcia");
        agendaContatos.exibirContatos();
        System.out.println("O numero e: " + agendaContatos.pesquisarPorNome("Marcia Polgada"));
    }
}
