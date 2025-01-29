package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.Bintroducaometodos.Exercicio.Dominio;

import java.util.Arrays;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    public Funcionario (String nome, int idade, double[] salarios){
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
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

    public double[] getSalarios(){
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        tiraMediaSalarial();
    }

    public void imprimeSalarios () {
        System.out.println(Arrays.toString(getSalarios()));
    }

    public void preencheSalarios () {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Digite o pagamento " + (i + 1) + ": ");
            double pagamento = scanner.nextInt();
            salarios[i] = pagamento;
            System.out.println("Salario " + (i + 1) + " = " + salarios[i]);
        }
        imprimeSalarios();
        scanner.close();
    }

    public void tiraMediaSalarial() {
        preencheSalarios();
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }

        media /= salarios.length;
        System.out.println("Media: " + media);

    }
}
