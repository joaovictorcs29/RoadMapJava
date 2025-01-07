package FundamentosDaLinguagem.MetodosEpassagemArgumentos;


public class ExemploMetodoSimples {
    public static void main(String[] args) {
        saudacao();

        int resultado = somar(5,10);
        System.out.println("Resultado: " + resultado);
    }

    // Metodo sem retorno e sem paramentros(void)
    public static void saudacao() {
        System.out.println("Ola, bem-vindo ao Java!");
    }

    //metodo que recebe parametros e retorna um valor
    public static int somar(int a, int b) {
        return a+b;
    }
}
