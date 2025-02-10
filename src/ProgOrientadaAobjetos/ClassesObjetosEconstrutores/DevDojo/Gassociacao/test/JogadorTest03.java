package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.dominio.Jogador;
import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador,jogador2};

        //Associei time ao jogador
        jogador.setTime(time);
        jogador2.setTime(time);

        //Associando os jogadores ao time
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();

        System.out.println("--- Time ---");

        time.imprime();

    }
}
