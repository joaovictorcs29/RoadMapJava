package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.Bintroducaometodos.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.Bintroducaometodos.dominio.Estudante;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();


        estudante01.nome = "Goku";
        estudante01.idade = 30;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 14;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
