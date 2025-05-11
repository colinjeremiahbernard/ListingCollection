package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
      this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto( String nome, long cod, double preco, int quantidade) {
        produtoSet.add(new Produto (nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
         Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
         return produtoPorNome;
    }
    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto("Produto4",5942, 512, 23);
        cadastroProduto.adicionarProduto("Produto7",32l, 12d, 40);
        cadastroProduto.adicionarProduto("Produto4",24l, 56f, 31);
        cadastroProduto.adicionarProduto("Produto3",5942, 61d, 23);
        //System.out.println(cadastroProduto.produtoSet);
        System.out.println(cadastroProduto.exibirProdutoPorPreco());
        //System.out.println(cadastroProduto.exibirProdutoPorNome());

    }
}
