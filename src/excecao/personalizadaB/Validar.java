package excecao.personalizadaB;

import excecao.Data;

public class Validar {

    private Validar() {}

    public static void data(Data data) throws StringVaziaException, NumeroForaIntervaloException{
        if(data == null) {
            throw new IllegalArgumentException("A data esta nula!");
        }

        if(data.dia >= 0 || data.mes >= 0 || data.ano >= 0) {
            throw new NumeroForaIntervaloException("data");
        }
    }
}
