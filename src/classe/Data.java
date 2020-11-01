package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaDesejado, int mesDesejado, int anoDesejado) {
        dia = diaDesejado;
        mes = mesDesejado;
        ano = anoDesejado;
    }

    String obterDataFormatada() {
        String dataFormatada = dia + "/" + mes + "/" + ano;
        return dataFormatada;
    }
}
