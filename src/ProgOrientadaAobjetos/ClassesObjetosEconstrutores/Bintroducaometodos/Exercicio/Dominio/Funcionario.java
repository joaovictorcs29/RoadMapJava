package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.Bintroducaometodos.Exercicio.Dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario01;
    private double salario02;
    private double salario03;

    public Funcionario (String nome, int idade, double salario01,
                        double salario02, double salario03 ){
        this.nome = nome;
        this.idade = idade;
        this.salario01 = salario01;
        this.salario02 = salario02;
        this.salario03 = salario03;
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

    public double getSalario01() {
        return salario01;
    }

    public void setSalario01(double salario01) {
        this.salario01 = salario01;
    }

    public double getSalario02() {
        return salario02;
    }

    public void setSalario02(double salario02) {
        this.salario02 = salario02;
    }

    public double getSalario03() {
        return salario03;
    }

    public void setSalario03(double salario03) {
        this.salario03 = salario03;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salario 1: " + getSalario01());
        System.out.println("Salario 2: " + getSalario02());
        System.out.println("Salario 3: " + getSalario03());
    }

    public void tiraMediaSalarial() {
        double media = (salario01 + salario02 + salario03) / 3;
        System.out.println("Media salarial: " + (int)media);
    }
}
