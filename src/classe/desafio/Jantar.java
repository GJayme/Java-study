package classe.desafio;

public class Jantar {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Gabriel", 65);
        Comida feijao = new Comida("Feijao", 0.300);
        Comida arroz = new Comida("Arroz", 0.600);

        System.out.println("Meu peso é: " + pessoa1.pesoPessoa);

        pessoa1.comer(feijao);
        pessoa1.comer(arroz);
        pessoa1.comer(feijao);
        pessoa1.comer(arroz);
        pessoa1.comer(feijao);
        pessoa1.comer(arroz);
        pessoa1.comer(feijao);

        System.out.println("Rapaz hoje eu comi em, estou pesando: " + pessoa1.pesoPessoa);
    }
}
