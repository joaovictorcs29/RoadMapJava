package com.exemplo.basico;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Ola, " + nome + " Bem-vindo(a)!");
        System.out.println("Hello World!");

        scanner.close();
    }


}
