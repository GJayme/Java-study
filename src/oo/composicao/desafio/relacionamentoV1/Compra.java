package oo.composicao.desafio.relacionamentoV1;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade) {
        this.itens.add(new Item(quantidade, p));
    }

    void adicionarItem(String nome, double preco, int quantidade) {
        var produto = new Produto(preco, nome);
        this.itens.add(new Item(quantidade, produto));
    }

    public double obterValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidadeItem * item.produto.precoProduto;
        }

        return total;
    }
}
