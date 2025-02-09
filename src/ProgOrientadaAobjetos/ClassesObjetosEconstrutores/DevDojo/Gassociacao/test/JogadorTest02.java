package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.dominio.Jogador;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        //criei 2 objetos
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Selecao Brasileira");

        //associei o jogador ao time
        jogador1.setTime(time);

        //imprimo
        jogador1.imprime();
    }
}
