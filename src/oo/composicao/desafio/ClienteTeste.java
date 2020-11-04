package oo.composicao.desafio;

public class ClienteTeste {

    public static void main(String[] args) {
        Produto ps5 = new Produto(4299, "PS5");
        Item itemPs5 = new Item(1, ps5);

//        Compra compra1 = new Compra(itemPs5);

        Compra compra1 = new Compra(new Item(1, new Produto(4299, "PS5")));
        Compra compra2 = new Compra(new Item(1, new Produto(7999, "Iphone 12")));

        Client client1 = new Client("Gabriel", compra1);

        client1.addCompra(compra2);



        System.out.println(client1.obterValorTotal());

    }
}
