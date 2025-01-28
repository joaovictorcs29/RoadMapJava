package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.Bintroducaometodos.Exercicio.Dominio;

import java.util.Arrays;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;

    public Funcionario (String nome, int idade, double[] salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario(){
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salarios: " + Arrays.toString(getSalario()));

    }

    public void tiraMediaSalarial(double[] salario) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        for (int i = 0; i < salario.length; i++) {
            System.out.print("Digite o pagamento " + (i + 1) + ": " );
            double pagamento = scanner.nextInt();
            salario[i] = pagamento;
            System.out.println("Salario " + (i + 1) + " = " + salario[i]);

            media += salario[i];
        }

        System.out.println("Media: " + media / salario.length);
        scanner.close();
    }
}
