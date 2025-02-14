package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Lclassesabstratas.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Lclassesabstratas.dominio.Desenvolvedor;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Lclassesabstratas.dominio.Funcionario;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Zoro", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Joao", 12000);
        System.out.println(desenvolvedor);
    }
}
