package oo.composicao.desafio.relacionamentoV2;

import java.util.ArrayList;

public class Cliente {

    String nomeCliente;

    ArrayList<Compra> compras = new ArrayList<>();

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    void addCompraCliente(Compra compra) {
        compras.add(compra);
    }

    double obterValorTotal() {
        double valorTotal = 0;

        for (Compra compra : compras) {
            valorTotal += compra.obterValorTotalItens();
        }
        return valorTotal;
    }
}
