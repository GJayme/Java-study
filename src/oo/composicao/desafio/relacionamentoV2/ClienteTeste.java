package oo.composicao.desafio.relacionamentoV2;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Gabriel");

        Compra compra1 = new Compra(new Item(1, new Produto("PS5", 4299)));
        Compra compra2 = new Compra(new Item(1, new Produto("Iphone 12", 7999)));

        cliente1.addCompraCliente(compra1);
        cliente1.addCompraCliente(compra2);

        System.out.println("Gastei: " + cliente1.obterValorTotal());
    }
}
