package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    double getPrecoComDesconto () {
        return preco * (1 - desconto);
    }

    double getPrecoComDesconto (double descontoDoGerente) {
        return preco * (1 - descontoDoGerente);
    }

}
