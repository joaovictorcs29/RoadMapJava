package FundamentosDaLinguagem.ProgramasSimples;

//Este programa testa a criacao e manipulacao de arrays em Java, como acessar e modificar elementos.

public class ManipulacaoDeArrays {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        // Acessando elementos do array
        System.out.println("Primeiro numero: " + numbers[0]);
        System.out.println("Ultimo numero: " + numbers[4]);

        // Modificando um valor no array
        numbers[2] = 10;
        System.out.println("Novo valor na posicao 2: " + numbers[2]);
    }
}
