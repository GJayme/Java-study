package oo.composicao.desafio;

import java.util.ArrayList;

public class Client {

    String nomeClient;
    ArrayList<Compra> compras = new ArrayList<>();

    public Client(String nomeClient, Compra compra) {
        this.nomeClient = nomeClient;
        compras.add(compra);
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
