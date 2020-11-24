package excecao;

public class Basico {

    public static void main(String[] args) {

        Data d1 = null;

        try {
            imprimirData(d1);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário: " + e);
        }

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        System.out.println("Fim!");
    }

    public static void imprimirData(Data data) {
        data.obterDataFormatada();
    }
}
