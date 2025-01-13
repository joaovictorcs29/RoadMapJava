package FundamentosDaLinguagem.MetodosEpassagemArgumentos;

public class SobreCargaMetodos {
    public static void main(String[] args) {
        System.out.println(somar(20, 10)); //chamando versão com dois inteiros

        System.out.println(somar(22.5, 30.5)); //Chamando versão com dois doubles
    }

    //Metodo com dois inteiros
    public static int somar (int a, int b) {
        return a + b;
    }

    //Metodo com dois doubles
    public static double somar (double a, double b) {
        return a + b;
    }


}
