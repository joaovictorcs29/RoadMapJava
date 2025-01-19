package FundamentosDaLinguagem.ArraysEMatrizesMultidimensionais;

//exercicio do Devdojo
public class ExercicioArray01 {
    public static void main(String[] args) {
        int[] arrayIdades = new int[3];

        int idade01 = 15;
        int idade02 = 20;
        int idade03 = 21;

        arrayIdades[0] = idade01;
        arrayIdades[1] = idade02;
        arrayIdades[2] = idade03;

        for (int i = 0; i < arrayIdades.length ; i++) {
            System.out.println("Imprimindo posicao " +i+ ": " + arrayIdades[i]);
        }
    }
}

