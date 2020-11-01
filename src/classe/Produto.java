package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto() {
    }

    Produto(String nomeInicial, double precoInical, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInical;
        desconto = descontoInicial;
    }

    double getPrecoComDesconto () {
        return preco * (1 - desconto);
    }

    double getPrecoComDesconto (double descontoDoGerente) {
        return preco * (1 - descontoDoGerente);
    }

}
