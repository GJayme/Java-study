package oo.heranca.desafio;

public class CarroTeste {

    public static void main(String[] args) {

        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari();

        civic.acelerar();
        ferrari.acelerar();

        System.out.println("Ferrari: " + ferrari);
        System.out.println("Civic: "+ civic);

        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();

        System.out.println("Ferrari: " + ferrari);
        System.out.println("Civic: " + civic);


    }
}
