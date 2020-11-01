package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    String obterDataFormatada() {
        String dataFormatada = dia + "/" + mes + "/" + ano;
        return dataFormatada;
    }
}
