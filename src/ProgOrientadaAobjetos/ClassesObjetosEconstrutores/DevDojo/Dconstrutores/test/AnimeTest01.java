package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Dconstrutores.test;

import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.DevDojo.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12); //Sobrecarga de metodos
        anime.init("Akudama Drive 2", "TV", 12, "Acao");
        anime.imprime();
    }
}
