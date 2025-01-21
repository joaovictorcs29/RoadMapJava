package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.ExerciciosExemplosDevDojo.dominio.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.ExerciciosExemplosDevDojo.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        //variavel de referencia "estudante" fazendo referencia ao objeto "Estudante".
        Estudante estudante = new Estudante();

        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'm';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
