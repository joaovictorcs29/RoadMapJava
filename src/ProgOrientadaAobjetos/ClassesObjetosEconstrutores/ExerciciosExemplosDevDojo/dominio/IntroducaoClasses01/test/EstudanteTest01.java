package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.ExerciciosExemplosDevDojo.dominio.IntroducaoClasses01.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.ExerciciosExemplosDevDojo.dominio.IntroducaoClasses01.Estudante01;

public class EstudanteTest01 {
    public static void main(String[] args) {
        //variavel de referencia "estudante" fazendo referencia ao objeto "Estudante01".
        Estudante01 estudante01 = new Estudante01();

        estudante01.nome = "Luffy";
        estudante01.idade = 21;
        estudante01.sexo = 'm';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
    }
}
