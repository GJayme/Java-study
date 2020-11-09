package oo.heranca.desafio;

public class Carro {

    final double VELOCIDADE_MAXIMA;
    double delta = 5;
    double velocidadeAtual;

    Carro(double velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    void frear() {
        if (velocidadeAtual - 5 < 0) {
            return;
        }

        velocidadeAtual -= 5;
    }

    @Override
    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + "Km/h.";
    }
}
