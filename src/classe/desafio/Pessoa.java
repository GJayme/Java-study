package classe.desafio;

public class Pessoa {

    String nomePessoa;
    double pesoPessoa;

    public Pessoa(String nome, double peso) {
        this.nomePessoa = nome;
        this.pesoPessoa = peso;
    }

    void comer(Comida comida){
        if(comida != null) {
            pesoPessoa += comida.pesoComida;
        }
    }

}
