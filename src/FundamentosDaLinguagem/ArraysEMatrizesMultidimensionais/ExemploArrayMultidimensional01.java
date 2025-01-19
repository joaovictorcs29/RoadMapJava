package FundamentosDaLinguagem.ArraysEMatrizesMultidimensionais;

public class ExemploArrayMultidimensional01 {
    public static void main(String[] args) {
        // primeiro array meses: 1,2,3,4,5
        //segundo array dias: 31, 28, 31, 30
        int [][] arrayMulti = new int[3][3];
        arrayMulti[0][0] = 31;
        arrayMulti[0][1] = 28;
        arrayMulti[0][2] = 31;

        arrayMulti[1][0] = 31;
        arrayMulti[1][1] = 28;
        arrayMulti[1][2] = 31;

        //percorrendo array com for normal
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println(arrayMulti[i][j]);
            }
            System.out.println();
        }

        System.out.println("--------------------");

        // for each
        for(int[] arrBase : arrayMulti){
            for (int num : arrBase){
                System.out.println(num);
            }
            System.out.println();
        }
    }
}
