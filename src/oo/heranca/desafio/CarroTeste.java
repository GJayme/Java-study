package oo.heranca.desafio;

public class CarroTeste {

    public static void main(String[] args) {

        Civic civic = new Civic(280.00);
        Ferrari ferrari = new Ferrari(350.00);

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
