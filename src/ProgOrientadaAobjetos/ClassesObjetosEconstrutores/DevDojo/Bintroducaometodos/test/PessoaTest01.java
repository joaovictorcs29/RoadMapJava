package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Bintroducaometodos.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(-1);
        pessoa.imprime();

        //System.out.println(pessoa.getNome());
        //System.out.println(pessoa.getIdade());
    }
}
