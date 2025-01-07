package FundamentosDaLinguagem.ArraysEMatrizesMultidimensionais;



/*Neste exemplo, a matriz 3D tem 2 "blocos", cada um com
3 linhas e 3 colunas. O loop percorre a dimensao da matriz.
* */
public class Matriz3D {
    public static void main(String[] args) {
        int [][][] matriz3D = new int[2][3][3]; //Matriz 3D com 2 "blocos", 3 linhas e 3 colunas

        //inicializando a matriz 3D
        matriz3D[0][0][0] = 1;
        matriz3D[0][0][1] = 2;
        matriz3D[0][0][2] = 3;
        matriz3D[1][0][0] = 4;
        matriz3D[1][0][1] = 5;
        matriz3D[1][0][2] = 6;


        // Percorrendo a matriz 3D
        for (int i = 0; i < matriz3D.length; i++) {
            for (int j = 0; j < matriz3D[i].length; j++) {
                for (int k = 0; k < matriz3D[i][j].length; k++) {
                    System.out.println(matriz3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
