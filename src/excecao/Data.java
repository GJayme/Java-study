package excecao;

public class Data {

    public int dia;
    public int mes;
    public int ano;

    Data() {
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1, 1, 1970);
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        String dataFormatada = dia + "/" + mes + "/" + ano;
        return dataFormatada;
    }
}
