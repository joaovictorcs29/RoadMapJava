package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.test;

import java.util.Scanner;
import java.util.Random;

import static java.lang.Character.toUpperCase;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char opcao;
        do {
            System.out.println("\nO grande software de previsao do futuro");
            System.out.print("Digite sua pergunta e eu responderei sim ou não: ");
            String pergunta = input.nextLine();

            Random rand = new Random();
            int respostaSimNao = rand.nextInt(0,  2);

            if (respostaSimNao == 0 ) {
                System.out.println("Não");
            } else System.out.println("Sim");

            System.out.println("Gostaria de Continuar fazendo perguntas? (s para Sim e n para Não)");
            opcao = toUpperCase(input.next().charAt(0));
            input.nextLine();
       } while(opcao != 'N');
        System.out.println("Volte Sempre 0_0");
    }
}
