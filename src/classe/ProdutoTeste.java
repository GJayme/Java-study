package classe;

import java.util.Properties;

import static java.lang.System.*;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Playstation 5", 4999);

        var produto2 = new Produto();
        produto2.nome = "Iphone 12";
        produto2.preco = 7999;

        Produto.desconto = 0.50;

        out.println(produto1.nome + " - " + produto1.getPrecoComDesconto());
        out.println(produto2.nome + " - " + produto2.getPrecoComDesconto());

        double precoFinal1 = produto1.getPrecoComDesconto(0.2);
        double precoFinal2 = produto2.getPrecoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println(precoFinal1);
        System.out.println(precoFinal2);

        System.out.printf("Média do carrinho = R$%.2f.\n", mediaCarrinho);
    }
}
