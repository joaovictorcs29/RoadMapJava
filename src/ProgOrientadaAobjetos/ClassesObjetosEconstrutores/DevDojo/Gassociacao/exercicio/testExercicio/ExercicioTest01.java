package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.exercicio.testExercicio;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.exercicio.dominio.Aluno;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.exercicio.dominio.Local;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.exercicio.dominio.Professor;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.exercicio.dominio.Seminario;

public class ExercicioTest01 {
    public static void main(String[] args) {
        //Criando enderecos
        Local local = new Local("Baker Street, 910");
        Local local2 = new Local("Carlos Gomes, 950");

        //criando seminarios
        Seminario seminario1 = new Seminario("Tecnologias em ascensao", local);
        Seminario seminario2 = new Seminario("Jutsus proibidos", local2);

        //criando alunos e passando como argumento o Objeto seminario
        Aluno aluno1 = new Aluno("Naruto", 13, seminario1);
        Aluno aluno2 = new Aluno("Goku", 15, seminario1);
        Aluno aluno3 = new Aluno("Beerus", 800, seminario2);
        Aluno aluno4 = new Aluno("Edward", 17, seminario2);

        //Adicionei o aluno a lista de alunos do seminario
        Aluno[] alunos1 = new Aluno[]{aluno1, aluno2};
        seminario1.setAlunos(alunos1);
        Aluno[] alunos2 = new Aluno[]{aluno3, aluno4};
        seminario2.setAlunos(alunos2);

        //Adicionando seminarios na lista de Seminarios
        Seminario[] seminarios = new Seminario[]{seminario1, seminario2};

        Professor professor = new Professor("Jiraya", "Invocacao de Sapos", seminarios);

        seminario1.imprimeSeminario();
        seminario1.imprimeParticipantes();

        seminario2.imprimeSeminario();
        seminario2.imprimeParticipantes();

        professor.imprimeProfessor();
    }
}
