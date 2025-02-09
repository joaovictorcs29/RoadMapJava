package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("neymar");
        Jogador jogador3 = new Jogador("ribamar");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
