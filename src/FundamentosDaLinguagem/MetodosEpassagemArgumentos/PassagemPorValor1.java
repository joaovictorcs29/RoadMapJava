package FundamentosDaLinguagem.MetodosEpassagemArgumentos;

public class PassagemPorValor1 {
    public static void main(String[] args) {
        int numero = 10;
        alterarValor(numero);
        System.out.println("Valor apos o metodo: " + numero);// O valor de numero nao foi alterado
    }

    //Passagem por valor: a alteracao do parametro nao afeta o valor original
    public static void alterarValor(int num) {
        num = 20 + 20; //Alterando o valor do parametro num
        System.out.println("Valor dentro do metodo: " + num);
    }

}
