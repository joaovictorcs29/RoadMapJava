package FundamentosDaLinguagem.MetodosEpassagemArgumentos;

public class MetodoRecursivo {
    public static void main(String[] args) {
        int resultado = fatorial(5);
        System.out.println("Fatorial de 5: " + resultado);
    }

    // Metodo recursivo para calcular o fatorial
    public static int fatorial(int n) {
        if(n == 0 ) {    //Caso base: fatorial de 0 e 1
            return 1;
        }

        return n * fatorial(n - 1); //chamada recursiva
    }
}
