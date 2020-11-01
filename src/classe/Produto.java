package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {
    }

    Produto(String nomeInicial, double precoInical) {
        nome = nomeInicial;
        preco = precoInical;
    }

    double getPrecoComDesconto () {
        return preco * (1 - desconto);
    }

    double getPrecoComDesconto (double descontoDoGerente) {
        return preco * (1 - descontoDoGerente);
    }
}
