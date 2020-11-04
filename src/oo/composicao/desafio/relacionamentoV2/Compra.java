package oo.composicao.desafio.relacionamentoV2;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> itens = new ArrayList<>();

    public Compra(Item item) {
        itens.add(item);
    }

    double obterValorTotalItens() {
        double valorTotalItem = 0;

        for (Item item : itens) {
            int quantidadeitem = item.quantidadeItem;
            double valorItem = item.produto.valorProduto;

            valorTotalItem += quantidadeitem * valorItem;
        }

        return valorTotalItem;
    }
}
