package excecao.personalizadaB;

import excecao.Data;

public class TesteValidacoes {

    public static void main(String[] args) {

        try {
            Data data = new Data(0, 0, 0);
            Validar.data(data);
        } catch (StringVaziaException | NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("FIM");
    }
}
