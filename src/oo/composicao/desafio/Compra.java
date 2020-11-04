package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> itens = new ArrayList<>();

    public Compra(Item item) {
        this.itens.add(item);
    }

    public double obterValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidadeItem * item.produto.precoProduto;
        }

        return total;
    }
}
