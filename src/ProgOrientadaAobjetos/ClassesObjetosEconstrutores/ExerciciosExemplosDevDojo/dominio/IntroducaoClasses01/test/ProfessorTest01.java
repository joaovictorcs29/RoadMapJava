package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.ExerciciosExemplosDevDojo.dominio.IntroducaoClasses01.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.ExerciciosExemplosDevDojo.dominio.IntroducaoClasses01.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
