package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Hheranca.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Hheranca.dominio.Endereco;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Hheranca.dominio.Funcionario;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("0123232");

        Pessoa pessoa = new Pessoa("Kuririm");

        pessoa.setCpf("010321321");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Picolo");

        funcionario.setCpf("2222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("----------------");
        funcionario.imprime();
    }

}
