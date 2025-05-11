package List.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int CodigoConvite ) {
        convidadoSet.add(new Convidado(nome, CodigoConvite));
    }
    public void removerConvidadoPorCodigoConvite( int CodigoConvite ) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == CodigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados() {
        return convidadoSet.size();
    }
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados c = new ConjuntoConvidados();
        System.out.println("Existem " + c.contarConvidados() +
                " convidado(s) dentro do set de convidados");
        c.adicionarConvidado("Valeria", 1574);
        c.adicionarConvidado("Johana", 4239);
        c.adicionarConvidado("Patty", 4239);
        c.adicionarConvidado("Noman", 1113);

        c.exibirConvidados();

        c.removerConvidadoPorCodigoConvite(4239);

        System.out.println("Existem " + c.contarConvidados() +
                " convidado(s) dentro do set de convidados");

    }
}
