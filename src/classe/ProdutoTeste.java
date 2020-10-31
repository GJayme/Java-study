package classe;

import static java.lang.System.*;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.nome = "Playstation 5";
        produto1.preco = 4999;
        produto1.desconto = 0.1;

        out.println(produto1.nome + " - " + produto1.preco + " - " + produto1.desconto);

        out.println(produto1);

        var produto2 = new Produto();
        produto2.nome = "Iphone 12";
        produto2.preco = 7999;
        produto2.desconto = 0.1;

        out.println(produto2.nome + " - " + produto2.preco + " - " + produto2.desconto);

        double precoFinal1 = produto1.preco * (1 - produto1.desconto);
        double precoFinal2 = produto2.preco * (1 - produto2.desconto);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);

    }
}
