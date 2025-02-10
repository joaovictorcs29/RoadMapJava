package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.dominio.Escola;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
