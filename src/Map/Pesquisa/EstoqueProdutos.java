package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }
    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() + p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                      produtoMaisCaro = p;
                }
            }
        }
       return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProdutos(45l, "ProdutoA", 45.8, 80);
        estoque.adicionarProdutos(53l, "ProdutoB", 98.7, 63);
        estoque.adicionarProdutos(07l, "ProdutoC", 201.0, 842);
        estoque.adicionarProdutos(84l, "ProdutoD", 103.9, 57);
        estoque.adicionarProdutos(40l, "ProdutoE", 76.5, 740);
        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: R$ " + estoque.obterProdutoMaisCaro());

    }
}
