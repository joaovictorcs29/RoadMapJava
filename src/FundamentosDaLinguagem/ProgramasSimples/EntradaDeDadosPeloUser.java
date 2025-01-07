package FundamentosDaLinguagem.ProgramasSimples;

//Este programa testa a entrada de dados do usuario usando
// o Scanner, permitindo interatividade.

import java.util.Scanner;

public class EntradaDeDadosPeloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Ola, " +nome+ "! Voce tem " +idade+ " anos.");

        scanner.close();

    }
}
