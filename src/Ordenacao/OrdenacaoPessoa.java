package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;
    public OrdenacaoPessoa() {
       this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa( String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura);
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Maria", 20, 1.85);
        ordenacaoPessoa.adicionarPessoa("Pedro", 33, 1.72);
        ordenacaoPessoa.adicionarPessoa("Joao", 23, 1.64);
        ordenacaoPessoa.adicionarPessoa("Virgina", 11, 1.35);

        //System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        //System.out.println(ordenacaoPessoa.pessoaList);
    }
}
