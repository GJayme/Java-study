package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa p1 =  new Pessoa(29,"Gabriel");

        System.out.println("Idade: " + p1.getIdade());
        System.out.println(p1); //ler
    }
}
