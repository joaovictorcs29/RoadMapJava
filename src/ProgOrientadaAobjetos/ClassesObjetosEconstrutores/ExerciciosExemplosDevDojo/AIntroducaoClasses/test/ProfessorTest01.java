package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.ExerciciosExemplosDevDojo.AIntroducaoClasses.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.ExerciciosExemplosDevDojo.AIntroducaoClasses.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
