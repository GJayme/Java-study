package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data dataNascimento = new Data();

        dataNascimento.dia = 20;
        dataNascimento.mes = 9;
        dataNascimento.ano = 1991;

        // Instanciando por eferencia!
        var d2 = new Data();

        d2.dia = 8;
        d2.mes = 8;
        d2.ano = 1992;

        System.out.println("Nasci no dia: " + dataNascimento.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
}
