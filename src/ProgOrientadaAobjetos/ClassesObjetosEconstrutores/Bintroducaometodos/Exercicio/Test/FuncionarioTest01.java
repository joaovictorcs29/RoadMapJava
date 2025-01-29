package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.Bintroducaometodos.Exercicio.Test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.Bintroducaometodos.Exercicio.Dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        double[] salario = new double[3];
        Funcionario funcionario = new Funcionario("Joao", 21, salario);

        //funcionario.tiraMediaSalarial();
        funcionario.imprimeDados();

    }
}
