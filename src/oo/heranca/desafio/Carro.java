package oo.heranca.desafio;

public class Carro {

    double velocidadeAtual;

    void acelerar() {
        velocidadeAtual += 5;
    }

    void frear() {
        if (velocidadeAtual - 5 < 0) {
            return;
        }

        velocidadeAtual -= 5;
    }
}
