package ProgOrientadaAobjetos.ClassesObjetosEconstrutores.ExerciciosExemplosDevDojo.AIntroducaoClasses.ExercicioClasses.test;


import ProgOrientadaAobjetos.ClassesObjetosEconstrutores.ExerciciosExemplosDevDojo.AIntroducaoClasses.ExercicioClasses.domain.Carro;

public class test {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();


        carro01.nome = "Fusca";
        carro01.modelo = "n sei";
        carro01.ano = 2022;
        System.out.println(carro01.nome + " " + carro01.modelo + " " + carro01.ano);

        carro02.nome = "scot";
        carro02.modelo = "n sei";
        carro02.ano = 1969;
        System.out.println(carro02.nome + " " + carro02.modelo + " " + carro02.ano);
    }
}
