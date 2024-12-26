package com.exemplo.basico.programasSimples;

import java.util.Scanner;

public class ExecutaOperacoesSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean mantem = true;

        System.out.print("Digite seu primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite seu segundo numero: ");
        int numero2 = scanner.nextInt();
        OperacoesMatematicas operacoesMatematicas = new OperacoesMatematicas(numero1,numero2);




        while(mantem) {
            System.out.println("\nNumeros escolhidos para realizar operacoes: " +operacoesMatematicas.getN1() + " e " + operacoesMatematicas.getN2());
            System.out.println("\nEscolha uma operacao");
            System.out.println("1) Soma");
            System.out.println("2) Subtracao");
            System.out.println("3) Multiplicao");
            System.out.println("4) Divisao");
            System.out.println("5) Sair");
            System.out.print("Opcao: ");
            byte opcao = scanner.nextByte();

            switch (opcao) {

                case 1: {
                    int soma = operacoesMatematicas.realizaSoma(operacoesMatematicas.getN1(), operacoesMatematicas.getN2());
                    System.out.println("Soma: " + soma);
                    break;
                }
                case 2: {
                    int subtracao = operacoesMatematicas.realizaSubtracao(operacoesMatematicas.getN1(), operacoesMatematicas.getN2());
                    System.out.println("Subtracao: " + subtracao);
                    break;
                }
                case 3: {
                    int multiplicacao = operacoesMatematicas.realizaMultiplicacao(operacoesMatematicas.getN1(), operacoesMatematicas.getN2());
                    System.out.println("Multiplicacao: " + multiplicacao);
                    break;
                }
                case 4: {
                    int divisao = operacoesMatematicas.realizaDivisao(operacoesMatematicas.getN1(), operacoesMatematicas.getN2());
                    System.out.println("Divisao: " + divisao);
                    break;
                }
                case 5: {
                    System.out.println("Programa fechando...");
                    mantem = false;
                    break;
                }
                default: {
                    System.out.println("Opcao invalida");
                }
            }
        }
    }
}
