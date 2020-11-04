package oo.composicao.desafio.relacionamentoV1;

import java.util.ArrayList;

public class Client {

    String nomeClient;
    ArrayList<Compra> compras = new ArrayList<>();

    public Client(String nomeClient) {
        this.nomeClient = nomeClient;
    }

    public void addCompra(Compra compra){
        compras.add(compra);
    }

    public double obterValorTotal(){
        double total = 0;
        for (Compra compra : compras) {
            total += compra.obterValorTotal();
        }
        return total;
    }




}
