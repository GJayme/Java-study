package oo.heranca.desafio;

public class Carro {

    private final double VELOCIDADE_MAXIMA;
    private double delta = 5;
    private double velocidadeAtual;

    protected Carro(double velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    public void frear() {
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
