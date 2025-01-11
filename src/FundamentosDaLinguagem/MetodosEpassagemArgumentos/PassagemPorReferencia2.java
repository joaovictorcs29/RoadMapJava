package FundamentosDaLinguagem.MetodosEpassagemArgumentos;

public class PassagemPorReferencia2 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        alterarValor2(numeros);
        System.out.println("Valor apos o metodo: " +numeros[0]); // O valor de numeros[0] será alterado
    }

    //Passagem de objeto (array e um tipo de referência): alterações afetam o objeto original
    public static void alterarValor2(int[] nums) {
        nums[0] = 99; // Alterando o primeiro valor do array
    }
}
