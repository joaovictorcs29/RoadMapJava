package ArraysEMatrizesMultidimensionais;

public class Matriz2D {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //Percorrendo a matriz 2D usando dois loops
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println(" "); // Quebra de linha para separar as linhas da matriz
        }
    }
}
