package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.Bintroducaometodos.Exercicio.Test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.Bintroducaometodos.Exercicio.Dominio.Funcionario;

import java.util.Scanner;

public class Salario01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario("Joao", 21, 1500.0,
                2000, 3500);

        funcionario.imprimeDados();
        funcionario.tiraMediaSalarial();










        scanner.close();
    }
}
