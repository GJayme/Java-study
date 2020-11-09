package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    public Ferrari(double velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        setDelta(35);
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        setDelta(15);
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;

    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public double getDelta() {
        if(ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr){
            return 20;
        } else {
            return 15;
        }
    }

    @Override
    public void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }
}
