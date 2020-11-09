package oo.heranca.desafio;

public class Ferrari extends Carro {

    Ferrari(double velocidadeMaxima){
        super(velocidadeMaxima);
    }

    @Override
    void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }
}
